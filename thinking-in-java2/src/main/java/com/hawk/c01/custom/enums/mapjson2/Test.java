package com.hawk.c01.custom.enums.mapjson2;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) {
		ObjectMapper om = new ObjectMapper();
		StringWriter sw = new StringWriter();
		try {

//			List list=new ArrayList();
//			list.add(StatusE.values());
//			list.add(UserE.values());
//			om.writeValue(sw, list);
			
//			List<Object> list=new ArrayList<Object>();
//			list.add(StatusE.values());
//			list.add(UserE.values());
//			om.writeValue(sw, list);
			
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("status", StatusE.values());
			map.put("user", UserE.values());
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
