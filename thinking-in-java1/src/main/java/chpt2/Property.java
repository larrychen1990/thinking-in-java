package chpt2;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

public class Property {
	public static void main(String[] args) {
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("---Memory Usage:");
		Runtime r = Runtime.getRuntime();
		System.out.println("FreeMemory:"+r.freeMemory()+" totalMemory:"+r.totalMemory());
		
		
	}
}
