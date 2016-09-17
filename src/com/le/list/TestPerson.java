package com.le.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 *@author CZ
 *@date����ʱ�� 2016��9��5������9:55:32
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class TestPerson {
	
	public static void main(String[] args) {
		
		List<Person> pList = new ArrayList<Person>();
		
		for(int i=0;i<=10000000;i++){
			Person p = new Person();
			p.setId(i++);
			p.setAge(20+i);
			p.setName("andy"+i);
			pList.add(p);
		}
		
		Date date = new Date();
		System.out.println("start����"+date);
		
		for(int i=0;i<10000000;i++){
			System.out.println(pList.get(i).getId()+pList.get(i).getName());
		}
		
		System.out.println("stop����"+new Date());
	}

}

