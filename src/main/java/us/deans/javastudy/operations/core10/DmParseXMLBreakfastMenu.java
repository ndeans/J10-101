package us.deans.javastudy.operations.core10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import us.deans.javastudy.base.BaseOperation;
import us.deans.javastudy.model.DataXMLFood;

public class DmParseXMLBreakfastMenu extends BaseOperation {

	private static final String ITEM = "food";
	private static final String ID = "id";
	private static final String NAME = "name";
	private static final String PRICE = "price";
	private static final String DESC = "description";
	private static final String CALS = "calories";
	
	public void start() {
		
		List<DataXMLFood> menu = parseMenuFromXML("C:\\Users\\ndeans\\projects\\food.xml");
		for (DataXMLFood item : menu) {
			System.out.println(item.toString());
		}
	}
	
	public List<DataXMLFood> parseMenuFromXML(String datafile) {
		
		List<DataXMLFood> items = new ArrayList<DataXMLFood>();
	
		try {
		
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			InputStream in = new FileInputStream(datafile);								// throws FileNotFoundException
			
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);			// throws XMLStreamException
			DataXMLFood item = null;
			
			
			// Loop Goes Here
			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();
				
				if (event.isStartElement()) {
				
					StartElement startElement = event.asStartElement();
					
					if (startElement.getName().getLocalPart().equals(ITEM)) {
						item = new DataXMLFood();
						Iterator<Attribute> attributes = startElement.getAttributes();
						
						while(attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(ID)) {
								item.setID(attribute.getValue());
							}
						}
					}

					if (event.isStartElement()) {
						if (event.asStartElement().getName().toString().equals(NAME)) {
							event = eventReader.nextEvent();
							item.setName(event.asCharacters().getData());
							continue;
						}
					}
					
					if (event.asStartElement().getName().getLocalPart().equals(PRICE)) {
						event = eventReader.nextEvent();
						item.setPrice(event.asCharacters().getData());
						continue;
					}
					
					if (event.asStartElement().getName().getLocalPart().equals(DESC)) {
						event = eventReader.nextEvent();
						item.setDescription(event.asCharacters().getData());
						continue;						
					}
					
					if (event.asStartElement().getName().getLocalPart().equals(CALS)) {
						event = eventReader.nextEvent();
						item.setCalories(event.asCharacters().getData());
						continue;
					}
				}
				
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart().equals(ITEM)) {
						items.add(item);
					}
					
				}
				
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
	
		return items;
	}
}
