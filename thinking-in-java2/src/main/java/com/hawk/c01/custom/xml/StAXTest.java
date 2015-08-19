package com.hawk.c01.custom.xml;

import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

public class StAXTest {
	public static void main(String[] args) {
		City c1 = new City(1, "Shanghai");
		City c2 = new City(2, "Zhengzhou");
		
		ArrayList<City> list = new ArrayList<City>();
		list.add(c1);
		list.add(c2);
		
		stAXToXml(list);
		
		
		
	}

	private static void stAXToXml(ArrayList<City> list) {
		String xmlString = null;
		
		try {
			System.out.println();
			
			if (null != list && !list.isEmpty()) {
				StringWriter stringWriter = new StringWriter();
				// PrintWriter writerXml = new PrintWriter(new
				// OutputStreamWriter( new FileOutputStream( &quot;city-StAX.xml&quot; ),
				// &quot;utf-8&quot; ));
 
				// define XMLEventWriter and XMLStreamWriter factory instance
				
				
				XMLOutputFactory xof = XMLOutputFactory.newInstance();
				XMLStreamWriter xmlStreamWriter = xof.createXMLStreamWriter(stringWriter);
				
				xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
				xmlStreamWriter.writeStartElement("cities");
				
				xmlStreamWriter.writeComment("city infos");
				
				
				for (City city : list) {
					xmlStreamWriter.writeStartElement("city");
					
					xmlStreamWriter.writeStartElement("id");
					xmlStreamWriter.writeCharacters(String.valueOf(city.getId()));
					xmlStreamWriter.writeEndElement();
					
					xmlStreamWriter.writeStartElement("name");
					xmlStreamWriter.writeCharacters(city.getName());
					xmlStreamWriter.writeEndElement();
					
					xmlStreamWriter.writeEndElement();
					
				}
				xmlStreamWriter.writeEndElement();
				xmlStreamWriter.writeEndDocument();
				
				xmlStreamWriter.flush();
				xmlStreamWriter.close();
				
				xmlString = stringWriter.getBuffer().toString();
				stringWriter.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("StAX:"+xmlString);
	}
}
