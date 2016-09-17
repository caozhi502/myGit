package com.le.thread.pool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** 
 *@author CZ
 *@date����ʱ�� 2016��8��20������8:54:59
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class Test {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("--����ʼ����--");
		Date date1 = new Date();
		
		int takeSize = 5;
		//����һ���̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(takeSize);
		//��������з���ֵ������
		List<Future> list = new ArrayList<Future>();
		for (int i = 0; i < takeSize; i++) {
			Callable c = new MyCallable(i + ""); 
			// ִ�����񲢻�ȡFuture����  
		    Future f = pool.submit(c);  
		    // System.out.println(">>>" + f.get().toString());  
		    list.add(f);  
		}
		 // �ر��̳߳�  
		   pool.shutdown();  
		  
		   // ��ȡ���в�����������н��  
		   for (Future f : list) {  
			    // ��Future�����ϻ�ȡ����ķ���ֵ�������������̨  
			    System.out.println(">>>" + f.get().toString());  
		   }  
		  
		   Date date2 = new Date();  
		   System.out.println("----�����������----����������ʱ�䡾"  
		     + (date2.getTime() - date1.getTime()) + "���롿"); 
	}

}

