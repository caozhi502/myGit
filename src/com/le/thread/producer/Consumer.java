package com.le.thread.producer;
/** 
 *@author CZ
 *@date����ʱ�� 2016��8��19������5:12:44
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

