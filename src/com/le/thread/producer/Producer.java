package com.le.thread.producer;
/** 
 *@author CZ
 *@date����ʱ�� 2016��8��19������4:02:37
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
				res.set("+��Ʒ+");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}

