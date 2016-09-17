package com.le.thread.dead;
/** 
 *@author CZ
 *@date创建时间 2016年8月19日上午11:10:16
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Dead {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Test(true));
		Thread t2 = new Thread(new Test(false));
		
		t1.start();
		t2.start();
	}

}

