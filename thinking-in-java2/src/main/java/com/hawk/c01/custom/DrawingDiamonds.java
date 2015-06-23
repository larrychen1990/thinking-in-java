package com.hawk.c01.custom;

public class DrawingDiamonds {
	private static final String S = System.lineSeparator();

    public static String drawDiamond(int size, boolean filled) {
        String diamond = "";
        for (int y = 1 - size; y <= (size - 1); y++) {
            for (int x = 1 - size; x <= size - 1; x++) {
                if (filled) {
                    if ((x + size - 1 >= -y) && (x + size - 1 >= y) && (x - size + 1 <= -y) && (x - size + 1 <= y)) {
                        diamond += "*";
                    } else {
                        diamond += " ";
                    }
                } else {
                    if ((x + size - 1 == -y) || (x + size - 1 == y) || (x - size + 1 == -y) || (x - size + 1 == y)) {
                        diamond += "*";
                    } else {
                        diamond += " ";
                    }
                }
            }
            diamond += S;
        }
        return diamond;
    }
    
    public static void main(String[] args) {
		System.out.println(drawDiamond(3, true));
	}
}
