package com.le.thread.test;
/** 
 *@author CZ
 *@date����ʱ�� 2016��8��18������4:57:23
 *@version 1.0
 *@parameter
 *@since
 *@return
 */
public class TicketDemo {

	public static void main(String[] args) {
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

}

