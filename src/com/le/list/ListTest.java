package com.le.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/** 
 *@author CZ
 *@date创建时间 2016年9月5日上午9:11:20
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class ListTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		
		for(int i=0;i<=100000000;i++){
			list.add(getRandomString());
		}
		Date date = new Date();
		for(int i=0;i<=100000000;i++){
			System.out.println(list.get(i));
		}
		System.out.println("start……"+date);
		System.out.println("stop……"+new Date());
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

