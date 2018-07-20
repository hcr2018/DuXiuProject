package com.hcr.bigdate.concurrent;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
		new Thread(()->{
			//��0��100֮�����һ��ֵ
			while(true){
			//��0������0����100֮�䣨����100����������101������һ�����������
			int i = new Random().nextInt(101);
			try {
				arrayBlockingQueue.put(i);
				Thread.sleep(500);
				System.out.println("����ֵ��"+i);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}).start();
		
		
		new Thread(()->{
			while(true){
			try {
				int i=arrayBlockingQueue.take();
				System.out.println("����ֵ"+i);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}).start();
	}
	

}
