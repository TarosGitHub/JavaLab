package xmlproc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

class XMLWriterTest {

	@Test
	void testWrite() {

		try {
			Path file = Paths.get("testdata/xmlproc/XmlWriterTest_testWriteExpected.xml");
			Document doc = XmlReader.read(file.toString());

			// 書き込み
			XmlWriter.write(doc, file.toString());

			// 書き込まれたXMLドキュメントをもう一度読み込み、もともと読み込まれたXMLドキュメントと比較するテスト
			Document writedDoc = XmlReader.read(file.toString());
			assertThat(doc.toString(), is(writedDoc.toString()));

		} catch (Exception e) {
			fail("テストに失敗");
		}
	}

}
