package com.le.thread.dead;
/** 
 *@author CZ
 *@date����ʱ�� 2016��8��19������11:05:39
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Test implements Runnable{
	
	private boolean flag;
	public Test(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if(flag){
			synchronized (MyLock.object1) {
				System.out.println("if---object1");
				synchronized (MyLock.object2) {
					System.out.println("if---object2");
				}
			}
		}else{
			synchronized (MyLock.object2) {
				System.out.println("else---object2");
				synchronized (MyLock.object1) {
					System.out.println("else---object1");
				}
			}
		}
		
	}
	
	

}

