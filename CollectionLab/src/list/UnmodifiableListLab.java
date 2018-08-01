package list;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class UnmodifiableListLab {

	// Constructors
	public UnmodifiableListLab() {
		list = new ArrayList<String>();
	}

	public UnmodifiableListLab(String ...strings) {
		list = new ArrayList<String>();

		for (String str : strings) {
			list.add(str);
		}
	}

	// Get a unmodifiable list.
	public List<String> getList() {
	    return Collections.unmodifiableList(list);
	}

	//
	// Private feilds and methods
	//

	private List<String> list;
}
