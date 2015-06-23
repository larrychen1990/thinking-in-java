package com.hawk.c01.custom.enums.mapjson1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class OrderTypeSerializer 
//extends JsonSerializer<OrderTypeE>{
extends JsonSerializer<NamedEnum>{
	
//	@Override
//	public void serialize(OrderTypeE value, JsonGenerator generator,
//			SerializerProvider provider) throws IOException,
//			JsonProcessingException {
//
//		generator.writeStartObject();
//		generator.writeFieldName("id");
//		generator.writeNumber(value.getId());
//		generator.writeFieldName("name");
//		generator.writeString(value.getName());
//		generator.writeEndObject();
//	}
	 
	 @Override
	 public void serialize(NamedEnum value, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {
		 Map<String, Object> map = new HashMap<String, Object>();
		 map.put("id", value.getId());
		 map.put("name", value.getName());
		 generator.writeObject(map);
	 }
	 
	 
}
