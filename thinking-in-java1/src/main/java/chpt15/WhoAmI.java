package chpt15;

//: WhoAmI.java
//Finds out your network address when you're 
//connected to the Internet.
import java.net.*;

public class WhoAmI {
public static void main(String[] args) 
   throws Exception {
	//Inspiron-5520
//	larrychen/180.168.41.175
 if(args.length != 1) {
   System.err.println(
     "Usage: WhoAmI MachineName");
   System.exit(1);
 }
 InetAddress a = 
   InetAddress.getByName(args[0]);
 System.out.println(a);
}
} ///:~
