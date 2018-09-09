package xmlproc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class XmlReaderTest {

	@Test
	void testRead() {

		try {
			Document doc = XmlReader.read("testdata/xmlproc/XmlReaderTest_testRead.xml");

			Element top = doc.getDocumentElement();
//			NodeList nodes = top.getChildNodes();
//			for (int i = 0; i < nodes.getLength(); i++) {
//				Node node = nodes.item(i);
//				String nodeName = node.getNodeName();
//
//				if ("first".equals(nodeName)) {
//
//				}
//			}

			assertThat(top.getTagName(), is("top"));

		} catch (Exception e) {
			fail("テストに失敗");
		}
	}

}
