package com.hawk.c01.custom.algorithm.java_manual;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise50 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String stus[][] = new String[5][6];
		String[] s = { "NO.", "name", "s1", "s2", "s3", "avg" };

		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus[i].length - 1; j++) {
				System.out.println("Pls input student" + (i + 1) + "'s " + s[j]);
				stus[i][j] = in.next();
			}
		}

		for (int i = 0; i < stus.length; i++) {
			int sum = 0;
			int count = 0;
			double avg = 0.0;
			for (int j = 2; j < stus.length - 1; j++) {
				sum += Integer.valueOf(stus[i][j]);
				count++;
			}
			avg = (double) sum / count;
			stus[i][stus[i].length-1] = String.valueOf(avg);
		}
		
		try {
			save("src/main/java/com/hawk/c01/custom/algorithm/java_manual/stus.txt", stus);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void save(String path, String[][] stus) throws IOException{
		File file = new File(path);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus[i].length; j++) {
				bw.write(stus[i][j]+"\t");
			}
			bw.write("\r\n");
		}
		
		System.out.println("Done!");
		
		bw.close();
	}
}
