package com.hcr.bigdate.forkjointask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import org.junit.Test;

public class TestCaltor {
	@Test
	public void run()throws Exception{
		//�����̳߳�
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		//���̳߳��н��м���
		ForkJoinTask<Integer> submit = forkJoinPool.submit(new Calculator(0,10000));
		if(!submit.isDone()){
			Thread.sleep(100);			
		}
		System.out.println(submit.get());
		forkJoinPool.shutdown();//�ر��̳߳�
	}

}
