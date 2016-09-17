package com.le.thread.test;
/** 
 *@author CZ
 *@date创建时间 2016年8月18日下午4:12:39
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Ticket implements Runnable {// extends Thread
	
	private int ticketNum = 1000;
	
	Object obj = new Object();
	
	public  void run(){
		
		while(true){
			show();
		}
	}
	
	public synchronized void show (){
		if(ticketNum>0){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--sale "+ ticketNum--);
		}
	}
	
	/*public static void main(String[] args) {
		Ticket ticket1 = new Ticket();
		Ticket ticket2 = new Ticket();
		Ticket ticket3 = new Ticket();
		Ticket ticket4 = new Ticket(); 
		
		ticket1.start();
		ticket2.start();
		ticket3.start();
		ticket4.start();
		
		Ticket t = new Ticket(); 
		
		Thread thread1 = new Thread(t);
		Thread thread2 = new Thread(t);
		Thread thread3 = new Thread(t);
		Thread thread4 = new Thread(t);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
*/
}

