package com.hawk.c01.custom.other;

import java.security.MessageDigest;

/**
 * 采用SHAA加密
 * 
 * @author Xingxing,Xie
 * @datetime 2014-6-1
 */
public class SHAUtil {
	/***
	 * SHA加密 生�?40�?SHA�?
	 * 
	 * @param 待加密字符串
	 * @return 返回40�?SHA�?
	 */
	public static String shaEncode(String inStr) throws Exception {
		MessageDigest sha = null;
		try {
			sha = MessageDigest.getInstance("SHA");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}

		byte[] byteArray = inStr.getBytes("UTF-8");
		for (int i = 0; i < byteArray.length; i++) {

			System.out.println(byteArray[i]);
		}
		byte[] md5Bytes = sha.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16) {
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}

	/**
	 * 测试主函数
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		String str = new String("larrychen");
		System.out.println("原始：" + str);
		System.out.println("SHA：" + shaEncode(str));

		System.out.println("toHexString: " + Integer.toHexString(0xff));
		System.out.println("toBinaryString: " + Integer.toBinaryString(0xff));
		System.out.println("toOctalString: " + Integer.toOctalString(0xff));
		System.out.println("toString: " + Integer.toString(0xff));
		System.out.println("toString: " + Integer.toString(0xff, 10));
	}
}
