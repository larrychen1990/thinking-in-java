package com.hawk.c01.custom.enums.mapjson1;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hawk.c01.custom.enums.mapjson2.StatusE;
import com.hawk.c01.custom.enums.mapjson2.UserE;

public class Test {
	public static void main(String[] args) {
		ObjectMapper om = new ObjectMapper();
		StringWriter sw = new StringWriter();
		try {

			
			
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("OrderTypeE1", OrderTypeE.values());
			map.put("OrderTypeE2", OrderTypeE.values());
			om.writeValue(sw, map);
			
			System.out.println(sw.toString());

		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
