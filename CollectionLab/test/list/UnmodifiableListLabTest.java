package list;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class UnmodifiableListLabTest {

	@Test
	void test() {
		UnmodifiableListLab unmodifiableListLab = new UnmodifiableListLab("111", "222");
		List<String> list = unmodifiableListLab.getList();

		try {
			list.set(0, "000");
		} catch (UnsupportedOperationException e) {
			assertThat(list.get(0), is("111"));
		}

		try {
			list.add("333");
		} catch (UnsupportedOperationException e) {
			assertThat(list.size(), is(2));
		}

		try {
			list.remove(0);
		} catch (UnsupportedOperationException e) {
			assertThat(list.size(), is(2));
			assertThat(list.get(0), is("111"));
		}
	}

}
