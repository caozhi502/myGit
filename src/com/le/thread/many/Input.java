package com.le.thread.many;
/** 
 *@author CZ
 *@date创建时间 2016年8月19日下午2:07:27
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Input implements Runnable{
	
	private Res r;
	Input(Res r){
		this.r = r;
	}

	public void run() {
		
		int x = 0;
		while(true){
			synchronized (r) {
				if(r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(x == 0){
					r.name = "Andy";
					r.sex = "male";
				}else{
					r.name = "大卫";
					r.sex = "男";
				}
				x = (x+1) % 2;
				r.flag = true;
				r.notify();
			}
		}
		
	}

}

