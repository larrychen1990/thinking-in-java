package com.hawk.c01.custom.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringHelper {
	private static final String REG_PHONE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	private static final String REG_EMAIL = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
	private static final String REG_POST_CODE = "^[1-9]\\d{5}$";
	private static final String REG_ID_CARD = "^\\d{15}|\\d{18}$";
	private static final String REG_CHINESE = "^[\u4e00-\u9fa5]+$";

	/**
	 * 判断str是否整数
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isInteger(String str) {
		return NumberUtils.isDigits(str);
	}

	/**
	 * 判断str是否数字（整数、小数、科学计数法等等格式）
	 * 
	 * @param str
	 *            非空字符串
	 * @return
	 */
	public static boolean isNumber(String str) {
		return NumberUtils.isNumber(str);
	}

	/**
	 * 是否是合格的手机号码格式
	 * 
	 * @param phoneNum
	 *            非空字符串电话号码
	 * @return true 合法的手机号
	 */
	public static boolean isPhoneNum(String phoneNum) {
		return isMatch(phoneNum, REG_PHONE);
	}

	//
	/**
	 * 判断email格式是否正确
	 * 
	 * @param email
	 *            非空字符串
	 * @return
	 */
	public static boolean isEmail(String email) {

		return isMatch(email, REG_EMAIL);
	}

	/**
	 * 匹配中国邮政编码
	 * 
	 * @param str
	 *            非空字符串
	 * @return
	 */
	public static boolean isPostCode(String str) {
		return isMatch(str, REG_POST_CODE);
	}

	/**
	 * 中国的身份证为15位或18位
	 * 
	 * @param str
	 *            非空字符串
	 * @return
	 */
	public static boolean isIdCard(String str) {
		return isMatch(str, REG_ID_CARD);
	}

	/**
	 * 非空字符串是否是中文
	 * 
	 * @param str
	 *            非空字符串
	 * @return 全是中文字符为true
	 */
	public static boolean isChinese(String str) {
		return isMatch(str, REG_CHINESE);
	}

	protected static boolean isMatch(String str, String regPattern) {
	
		if (str == null || str.length() == 0)
			return false;
	
		Pattern p = Pattern.compile(regPattern);
		Matcher m = p.matcher(str);
	
		return m.matches();
	}

	/**
	 * 剔除首尾空格
	 * 
	 * @param str
	 * @return 剔除首尾空格
	 */
	public static String trim(String str) {
		return StringUtils.trim(str);
	}
}
