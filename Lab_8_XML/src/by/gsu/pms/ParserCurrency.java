package by.gsu.pms;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserCurrency extends DefaultHandler {

	private Currency currency = null;
	private boolean isCurrency = false;
	private String tempElement = null;

	private List<Currency> currencies = new ArrayList<>();

	public List<Currency> getCurrencies() {
		return currencies;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		tempElement = localName;

		final int ID_INDEX = 0;
		final String CURR = "Currency";

		if (tempElement.equals(CURR)) {
			isCurrency = true;
			currency = new Currency();
			int id = Integer.parseInt(attributes.getValue(ID_INDEX));
			currency.setCurrencyId(id);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (isCurrency) {
			isCurrency = false;
			currencies.add(currency);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String string = new String(ch, start, length).replace("\n", "").trim();
		
		final String NAME = "Name";
		final String CHAR_CODE = "CharCode";
		final String RATE = "Rate";
		final String NUM_CODE = "NumCode";
		final String SCALE = "Scale";
		

		if (tempElement.equals(NAME) && !string.isEmpty()) {
			currency.setName(string);
		}

		if (tempElement.equals(CHAR_CODE) && !string.isEmpty()) {
			currency.setCharCode(string);
		}

		if (tempElement.equals(RATE) && !string.isEmpty()) {
			double rate = Double.parseDouble(string);
			currency.setRate(rate);
		}
		
		if (tempElement.equals(NUM_CODE) && !string.isEmpty()) {
			int numCode = Integer.parseInt(string);
			currency.setNumCode(numCode);
		}
		
		if (tempElement.equals(SCALE) && !string.isEmpty()) {
			int scale = Integer.parseInt(string);
			currency.setScale(scale);
		}
	}

}
