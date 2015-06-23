package com.hawk.c01.custom;

import net.openhft.lang.Maths;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StringInterner {
    private final String[] interner;
    private final int mask;
    public StringInterner(int capacity) {
        int n = Maths.nextPower2(capacity, 128);
        interner = new String[n];
        mask = n - 1;
    }

    private static boolean isEqual(@Nullable CharSequence s, @NotNull CharSequence cs) {
        if (s == null) return false;
        if (s.length() != cs.length()) return false;
        for (int i = 0; i < cs.length(); i++)
            if (s.charAt(i) != cs.charAt(i))
                return false;
        return true;
    }

    @NotNull
    public String intern(@NotNull CharSequence cs) {
        long hash = 0;
        for (int i = 0; i < cs.length(); i++)
            hash = 57 * hash + cs.charAt(i);
        int h = (int) Maths.hash(hash) & mask;
        String s = interner[h];
        if (isEqual(s, cs))
            return s;
        String s2 = cs.toString();
        return interner[h] = s2;
    }
    
    public static void main(String[] args) {
    	StringInterner si=new StringInterner(1024);
    	boolean b = si.isEqual(Character.valueOf('c').toString(), null);
    	System.out.println(b);
	}
}
