package xmlproc;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class XmlWriter {

	public XmlWriter() {
		// DO NOTHING
	}

	/**
	 * XMLドキュメントを指定されたファイルに書き込む。ファイルが既に存在する場合は上書きする。
	 *
	 * @param doc XMLドキュメントオブジェクト
	 * @param file ファイル名
	 * @throws TransformerFactoryConfigurationError
	 * @throws TransformerException
	 * @throws IOException
	 */
	public static void write(Document doc, String file)
			throws TransformerFactoryConfigurationError, TransformerException, IOException {

		FileWriter fw = new FileWriter(file);
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.setOutputProperty(OutputKeys.METHOD, "xml");
		//tf.setOutputProperty(OutputKeys.INDENT, "yes");
		//tf.setOutputProperty(OutputKeys.STANDALONE, "no");
		//tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		doc.setXmlStandalone(true);// standalone属性を消す。DOMSourceを作成する前にこれをコールする必要あり。

		// XMLドキュメントの内容をファイルへ出力する
		tf.transform(new DOMSource(doc), new StreamResult(fw));
	}
}
