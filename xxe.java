import javax.xml.parsers.DocumentBuilderFactory;

public class SafeXML {
    public static void main(String[] args) throws Exception {
        var factory = DocumentBuilderFactory.newInstance();
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true); 
        var builder = factory.newDocumentBuilder();
        var xml = "<root>data</root>";
        var doc = builder.parse(new java.io.ByteArrayInputStream(xml.getBytes()));
        System.out.println(doc.getDocumentElement().getTextContent());
    }
}

