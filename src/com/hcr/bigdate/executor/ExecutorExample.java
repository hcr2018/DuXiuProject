package com.hcr.bigdate.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample {
	
	private Executor executor;//����һ��ִ����

	

	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
	
	public void executeTasks(){//��ִ����ִ�ж������
		for (int i = 0; i < 6; i++) {
			executor.execute(new SimpleTask("task"+i));
		}
	}
	
	public static void main(String[] args) {
		ExecutorExample ex = new ExecutorExample();
		//ͨ�������ഴ��һ����3���̶̹߳��߳�
		ex.setExecutor(Executors.newFixedThreadPool(3));
		ex.executeTasks();
	}
	
}
/**
 * ������
 * @author cjx
 *
 */
class SimpleTask implements Runnable{
	private String taskName;
	
	 public SimpleTask(String taskName) {
		// TODO Auto-generated constructor stub
		this.taskName = taskName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("do"+taskName+".....in thread"+Thread.currentThread().getId());
	}
	
}
