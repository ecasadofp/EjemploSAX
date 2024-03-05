package clases;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EscuchadorSAX extends DefaultHandler {

    String leido ="";
    int caloriasTotales = 0;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Empieza la lectura del documento");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Las calorías totales son: " + caloriasTotales);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        leido = new String(ch,start, length);

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("calories"))
            caloriasTotales += Integer.parseInt(leido);
    }
}
