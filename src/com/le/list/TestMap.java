package com.le.list;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/** 
 *@author CZ
 *@date创建时间 2016年9月5日下午1:37:46
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class TestMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0;i<1000;i++){
			map.put(i++, getRandomString());
		}
		Date d = new Date();
		Set<Entry<Integer,String>> set = map.entrySet();
		for (Entry<Integer, String> entry : set) {
			Integer key = entry.getKey();
			System.out.println(key);
			System.out.println(entry.getValue());
		}
		System.out.println(d);
		System.out.println(new Date());
	}
	
	public static String getRandomString() {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < 6; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();  
	}


}

