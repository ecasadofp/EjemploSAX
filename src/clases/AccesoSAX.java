package clases;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class AccesoSAX {


    public static void leeDesayunos(){

        SAXParserFactory spf = SAXParserFactory.newInstance();

        try {
            SAXParser sp = spf.newSAXParser();
            sp.parse("resources/desayunos.xml",new EscuchadorSAX());

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
