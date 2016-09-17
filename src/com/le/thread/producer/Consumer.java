package com.le.thread.producer;
/** 
 *@author CZ
 *@date创建时间 2016年8月19日下午5:12:44
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Consumer implements Runnable{

	private Resouce res;
	
	public Consumer(Resouce res) {
		this.res = res;
	}
	
	public void run() {
		while(true){
			try {
				res.out();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

