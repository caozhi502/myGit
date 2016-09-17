package com.le.thread.producer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 *@author CZ
 *@date创建时间 2016年8月19日下午3:58:33
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Resouce {
	
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	private Lock lock = new ReentrantLock();
	
	private Condition condition_pro = lock.newCondition();//返回用来与此 Lock 实例一起使用的 Condition 实例
	private Condition condition_con = lock.newCondition();
	
	public void set(String name) throws InterruptedException{
		
		lock.lock();
		try {
			while(flag){
				condition_pro.await();//造成当前线程在接到信号或被中断之前一直处于等待状态。
				this.name = name + "---" + count++;
				System.out.println(Thread.currentThread().getName()+"……生产者"+this.name);
				flag = true;
				condition_con.signal();//唤醒一个等待线程
			}
		}finally{
			lock.unlock();
		}
	}

	public void out() throws InterruptedException{
		
		lock.lock();
		try {
			while(!flag){
				condition_con.await();
				System.out.println(Thread.currentThread().getName()+"……消费者"+this.name);
				flag = false;
				condition_pro.signalAll();
			}
		} finally{
			lock.unlock();//释放锁，为了唤醒对方线程
		}
		
	}
	
}

