package com.hawk.c01.custom;

public class Knapsack {
	 public static void main(String[] args) throws Exception {
	        int v[] = {10, 40, 30, 50};	// value of goods
	        int w[] = {5, 4, 6, 3};		//weight of goods
	        int c = 10;					//capacity of knapsack
	 
	        System.out.println(knapsack(v, w, c));
	    }
	 
	    public static int knapsack(int v[], int w[], int c) {
	        //Get the total number of items. 
	        //Could be w.length or v.length. Doesn't matter
	        int wl = w.length; 
	 
	        //Create a matrix. 
	        //Items are in rows and weight at in columns +1 on each side
	        int[][] V = new int[wl + 1][c + 1]; 
	 
	        //What if the knapsack's capacity is 0 - Set
	        //all columns at row 0 to be 0
	        for (int col = 0; col <= c; col++) {
	            V[0][col] = 0;
	        }
	 
	        //What if there are no items at home.  
	        //Fill the first row with 0
	        for (int row = 0; row <= wl; row++) {
	            V[row][0] = 0;
	        }
	 
	        for (int item=1;item<=wl;item++){
	            //Let's fill the values row by row
	            for (int weight=1;weight<=c;weight++){
	                //Is the current items weight less
	                //than or equal to running weight
	                if (w[item-1]<=weight){
	                    //Given a weight, check if the value of the current 
	                    //item + value of the item that we could afford 
	                    //with the remaining weight is greater than the value
	                    //without the current item itself
	                    V[item][weight]=Math.max (v[item-1]+V[item-1][weight-w[item-1]], V[item-1][weight]);
	                }
	                else {
	                    //If the current item's weight is more than the
	                    //running weight, just carry forward the value
	                    //without the current item
	                    V[item][weight]=V[item-1][weight];
	                }
	            }
	 
	        }
	 
	        //Printing the matrix
	        for (int[] rows : V) {
	            for (int col : rows) {
	                System.out.format("%5d", col);
	            }
	            System.out.println();
	        }
	 
	        return V[wl][c];
	    }
}
