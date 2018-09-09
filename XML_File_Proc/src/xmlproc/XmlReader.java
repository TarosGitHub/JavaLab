package xmlproc;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlReader {

	/**
	 * This constructor does nothing.
	 */
	public XmlReader() {
		// DO NOTHING
	}

	/**
	 * Specifies the path to the file and reads the XML file. Returns the Document
	 * object when the file is successfully read.
	 *
	 * @param file The path to the file. If you pass {@code null} as this argument,
	 *             IOException will be raised.
	 * @return Document object of the read XML file. It does not return null.
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 */
	public static Document read(String file) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(file);
	}

}
