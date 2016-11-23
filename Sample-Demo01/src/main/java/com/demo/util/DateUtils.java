/**
 * 
 */
package com.demo.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shipengfei
 *
 */
public class DateUtils {

    public static final String datetimeFormater = "yyyy-MM-dd HH:mm:ss";
    public static final String dateFormater = "yyyy-MM-dd";
    public static final String dateFormater2 = "yyyyMMdd";

    /**
     * 格式化时�?
     */
    public static String formatDateTime(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(datetimeFormater);
        return df.format(date);
    }
    
    public static String formatDate2(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(dateFormater2);
        return df.format(date);
    }

    /**
     * 格式化时间戳
     */
    public static String formatTimeMillion(String time) {
        if(time != null){
            Date date = new Date(Long.parseLong(time) * 1000);
            SimpleDateFormat format = new SimpleDateFormat(dateFormater);
            String str = format.format(date);
            return str;
        }
        return "";
    }

    /**
     * 根据具体的时间获得时间戳
     * 
     * @param datetime
     * @return
     */
    public static long getLongTime(String datetime) {
        SimpleDateFormat df = new SimpleDateFormat(datetimeFormater);
        Date date = null;
        try {
            date = df.parse(datetime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(date != null){
            return date.getTime() / 1000;
        }else{
            return 0;
        }
    }

    /**
     * 根据具体的时间获得时间戳
     * 
     * @param datetime
     * @return
     */
    public static String getFormatTime(String time) {
        DecimalFormat df = new DecimalFormat("#");
        double d = Double.parseDouble(time);
        String result = df.format(d);
        return formatTimeMillion(result);
    }
    
    public static String  converTime(long time){
        Date d = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
        return sdf.format(d);
    }
}