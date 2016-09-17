package com.le.thread.producer;
/** 
 *@author CZ
 *@date创建时间 2016年8月19日下午7:02:06
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Test {
	
	public static void main(String[] args) {
		Resouce r = new Resouce();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}

