package com.le.thread.producer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 *@author CZ
 *@date����ʱ�� 2016��8��19������3:58:33
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
	
	private Condition condition_pro = lock.newCondition();//����������� Lock ʵ��һ��ʹ�õ� Condition ʵ��
	private Condition condition_con = lock.newCondition();
	
	public void set(String name) throws InterruptedException{
		
		lock.lock();
		try {
			while(flag){
				condition_pro.await();//��ɵ�ǰ�߳��ڽӵ��źŻ��ж�֮ǰһֱ���ڵȴ�״̬��
				this.name = name + "---" + count++;
				System.out.println(Thread.currentThread().getName()+"����������"+this.name);
				flag = true;
				condition_con.signal();//����һ���ȴ��߳�
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
				System.out.println(Thread.currentThread().getName()+"����������"+this.name);
				flag = false;
				condition_pro.signalAll();
			}
		} finally{
			lock.unlock();//�ͷ�����Ϊ�˻��ѶԷ��߳�
		}
		
	}
	
}

