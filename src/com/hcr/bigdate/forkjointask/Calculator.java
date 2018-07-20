package com.hcr.bigdate.forkjointask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

import org.junit.Test;
/**
 * Fork/join���
 * @author cjx
 *�з���ֵ��RecursiveTask<V>
 *�޷���ֵ��RecursiveTask
 */
public class Calculator extends RecursiveTask<Integer> {
	
	private  static final int THRESHOLD=100;//������ֵ
	private int start;
	private int end;
	
	public Calculator(int start,int end){
		this.start=start;
		this.end=end;
	}
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		int sum=0;
		//���������С����ֵ����ֱ�Ӽ���
		if((start-end<THRESHOLD)){
			for (int i = start; i < end; i++) {
				sum=sum+i;
			}
		}else{//���������ֵ���Ͱ�����ֳ��������������fork
			int middle=(start+end)/2;
			Calculator left = new Calculator(start, middle);//һ����С�߳�
			left.fork();//������С�����߳�
			Calculator right = new Calculator(middle+1, end);			
			right.fork();
			//left.join()---��left�����������
			//right.join()---��right�����������
			sum=left.join()+right.join();
		}
		return sum;
		
	}
	
	
}



	
