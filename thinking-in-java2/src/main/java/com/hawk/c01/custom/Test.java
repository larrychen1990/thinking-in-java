package com.hawk.c01.custom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;

public class Test {
	private static final Object NullObject = "";
	private final String fiString;

	public Test(String fiString) {
		this.fiString = fiString;
	}
	public static void main(String[] args) {
		
		Long l=new Long(0L);
		System.out.println(l instanceof Long);
		System.out.println(l);
		
		long parseLong = Long.parseLong("+5", 10);
		System.out.println(parseLong);
		
		
		
		
//		String s="9.0";
//		Double d=new Double(s);
//		System.out.println(d);
		
//		Integer i=2;
//		System.out.println(i.doubleValue());
		
		
		
		
//		String s=" ";
//		if (null!=s&&s.length()!=0) {
//			System.out.println("s.length()"+s.length());
//		}else{
//			System.out.println("else s.length()"+s.length());
//		}
//		Map<Integer,String> map=new HashMap<Integer, String>();
//		map.put(1, "11");
//		map.put(2, "21");
//		map.put(3, "31");
//		map.put(4, "41");
//		
//		System.out.println(map);
//		
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> it = keySet.iterator();
//		while (it.hasNext()) {
//			Integer next = it.next();
//			String string = map.get(next);
//			System.out.println(string);
//		}
//		
//		Object[] array = map.values().toArray();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//		Double d=1d;
//		System.out.println(d);
		
		
		
		
		
//		String str = "[][]a,b";
//		String[] split = str.split("[,]");
//		for (int i = 0; i < split.length; i++) {
//			System.out.println(split[i]);
//			System.out.println(split[i]);
//			System.out.println();
//			System.out.println();
//
//		}
		// Color[] values = Color.values();
		// for (int i = 0; i < values.length; i++) {
		// System.out.println(values[i]);
		// }
		// Color valueOf = Color.valueOf("RED");
		// System.out.println(valueOf);
//		Test t = new Test("df");
		// System.out.println(t.fiString);
		// try {
		// t.store();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Calendar c=Calendar.getInstance();
		//
		// String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
		//
		// System.out.println(s);

		// Currency c=Currency.getInstance(Locale.CHINA);
		// System.out.println(c.getCurrencyCode());
		//
		// String string="";
		// if (null!=string) {
		// System.out.println("null");
		// }
//		t.Prt();
		

	}

	public static Object retn() {
		
		return NullObject;
	} 
	@PostConstruct
	public void Prt() {
		System.out.println("jkjk");
	}

	public void store() throws IOException {
		Properties props = new Properties();
		
		
		OutputStream fos = new FileOutputStream("src/com/eagle/c01/t.txt");
		props.storeToXML(fos, "xml");
	}
}

enum Color {
	RED, BLUE, BLACK, YELLOW;

}
