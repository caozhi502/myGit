package com.le.thread.pool;

import java.util.Date;
import java.util.concurrent.Callable;

/** 
 *@author CZ
 *@date����ʱ�� 2016��8��20������9:20:00
 *@version 1.0
 *@parameter
 *@since
 *@return
*/
public class MyCallable implements Callable {
	
	private String taskNum;
	MyCallable(String taskNum) {  
		   this.taskNum = taskNum;  
	} 
	
	public Object call() throws Exception {
	   System.out.println(">>>" + taskNum + "��������");  
	   Date dateTmp1 = new Date();  
	   Thread.sleep(1000);  
	   Date dateTmp2 = new Date();  
	   long time = dateTmp2.getTime() - dateTmp1.getTime();  
	   System.out.println(">>>" + taskNum + "������ֹ");  
	   return taskNum + "���񷵻����н��,��ǰ����ʱ�䡾" + time + "���롿";  
	}

}

