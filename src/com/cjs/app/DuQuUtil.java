package com.cjs.app;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class DuQuUtil {

	/**
	* 获取控制台用户的一行输入
	*@param tip 输入提示
	*@param defaultValue 如果用户未输入时的默认值
	*@return 获取的输入
	*/
	public static String readLine(String tip,String defaultValue){
		System.out.println(tip);
		Console console=System.console();
		String line=null;
		if(console!=null) {
			line=console.readLine();
		}else {
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			try {
			line=in.readLine();
			}catch (Exception e) {}
		}
		if(line.length()==0){
			return defaultValue;
		}
		return line;
	}
	
	public static String readInt(String tip,int defaultValue){
		System.out.println(tip);
		Console console=System.console();
		String line=null;
		if(console!=null) {
			line=console.readLine();
		}else {
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			try {
			line=in.readLine();
			}catch (Exception e) {}
		}
		return line;
	}
	
	public static String readDouble(String tip,double defaultValue){
		System.out.println(tip);
		Console console=System.console();
		String line=null;
		if(console!=null) {
			line=console.readLine();
		}else {
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			try {
			line=in.readLine();
			}catch (Exception e) {}
		}
		return line;
	}
	

}
