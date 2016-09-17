package com.le.thread.many;
/** 
 *@author CZ
 *@date创建时间 2016年8月19日下午2:13:24
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Test {
	
	public static void main(String[] args) {
		
		Res r = new Res();
		
		Thread t1 = new Thread(new Input(r));
		Thread t2 = new Thread(new Output(r));
		
		t1.start();
		t2.start();
	}

}

