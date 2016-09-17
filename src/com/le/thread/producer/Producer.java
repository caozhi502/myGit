package com.le.thread.producer;
/** 
 *@author CZ
 *@date创建时间 2016年8月19日下午4:02:37
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Producer implements Runnable{
	
	private Resouce res;
	
	public Producer(Resouce res) {
		this.res = res;
	}

	public void run() {
		
		while(true){
			try {
				res.set("+商品+");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}

