package com.le.thread.many;
/** 
 *@author CZ
 *@date创建时间 2016年8月19日下午2:12:02
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Output implements Runnable{
	

	private Res r;
	
	Output(Res r){
		this.r = r;
	}
	
	public void run() {
		while(true){
			synchronized (r) {
				if(!r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(r.name+"--"+r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
	
	

}

