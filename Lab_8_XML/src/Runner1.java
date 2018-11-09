import java.io.IOException;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.gsu.pms.Currency;
import by.gsu.pms.ParserCurrency;

public class Runner1 {

	public static void main(String[] args) {
		final String FILE_NAME = "src//currency.xml";
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			ParserCurrency parser = new ParserCurrency();
			reader.setContentHandler(parser);
			reader.parse(FILE_NAME);

			List<Currency> currencies = parser.getCurrencies();
			
			for (Currency currency : currencies) {
				System.out.println(currency);
			}
			
		} catch (SAXException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
