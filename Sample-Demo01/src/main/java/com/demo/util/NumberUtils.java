/**
 * 
 */
package com.demo.util;

import java.text.DecimalFormat;

/**
 * @author shipengfei
 *
 */
public class NumberUtils {
	
	public static String formatTosepara(Integer data) {
		DecimalFormat df = new DecimalFormat("#,###"); 
		return df.format(data);
	}
	
	public static String formatDoubleNumber(Double num){
		DecimalFormat df=new DecimalFormat("#,###.##");
		return df.format(num);
	}

}
