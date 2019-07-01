package com.cjs.app;

public class IntChange {
	/**
	*"@@@@"
	*@param 一个字符串 
	*@param 转换过程使用的进制
	*@return 转换后的整数
	*@throws NullPointerException 如果s为null
	*@throws IllegalArgumentException 如果s不是合法的数字字符串
	*@throws IllegalArgumentException 如果radix小于等于1或大于32
	*/
	public static int parseInt(String s,int radix){
		return Integer.parseInt(s,radix);
	}
}
