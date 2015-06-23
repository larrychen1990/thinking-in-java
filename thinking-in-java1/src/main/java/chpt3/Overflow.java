package chpt3;

public class Overflow {
	  public static void main(String[] args) {
//	    int big = 0x7fffffff; // max int value
//	    prt("big = " + big);
//	    int bigger = big * 4;
//	    prt("bigger = " + bigger);
//		  double r = 0.0;
//		    while(r < 0.99d) {
//		      r = Math.random();
////		      if(r>=0.99d) return;
//		      System.out.println(r);
//		    }
//		  for(int i = 1, j = i + 10; i < 5;
//	        i++, j = i * 2) {
//	      System.out.println("i= " + i + " j= " + j);
//	    }
		  for(int i = 0; i < 100; i++) {
		      if(i == 74) break; // Out of for loop
		      if(i % 9 != 0) continue; // Next iteration
		      System.out.println(i);
		    }
		  int i = 0;
		    // An "infinite loop":
		    while(true) {
		      i++;
		      int j = i * 27;
		      if(j == 1269) break; // Out of loop
		      if(i % 10 != 0) continue; // Top of loop
		      System.out.println(i);
		    }

	  }
	  static void prt(String s) {
	    System.out.println(s);
	  }
	} 
