package com.XMPP.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TimeUtil {
	private final static String format = "MM-dd HH:mm";
	private final static int longBefore = 5000;
	
	public static String getCurrentTime2String(){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate = sdf.format(Calendar.getInstance().getTime());	
		return strDate;	
	}
	
	public static String getCurrentViewTime(){
		String strDate = getCurrentTime2String();
		String viewTime = null;
		Date date;
		try {
			date = new SimpleDateFormat(format).parse(strDate);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			int day_past = cal.get(Calendar.DAY_OF_YEAR);
			int day_now = cal.get(Calendar.DAY_OF_YEAR);
			String hour_minite = strDate.substring(strDate.indexOf(" "));	

			if(day_now - day_past == 1){
				viewTime = "Yesterday" + hour_minite;
			}else if(day_now == day_past){
				viewTime = "Today" + hour_minite;
			}else{
				viewTime = hour_minite;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return viewTime;
	}
	
	public static boolean isLongBefore(String pastStr,String nowStr){
		Date datePast;
		Date dateNow;
		try {
			dateNow = new SimpleDateFormat(format).parse(nowStr);
			datePast = new SimpleDateFormat(format).parse(pastStr);
			System.out.println(dateNow.getTime() + "longbefore " +datePast.getTime());
			if(dateNow.getTime() - datePast.getTime() >= longBefore){
				return true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return false;
	}

}