package com.hcr.bigdate.consts;

import org.junit.Test;
import static com.hcr.bigdate.consts.PersonConsts.*;
public class TestConsts {
	@Test
	public void test(){
		//��������ֱ������������
		int numBer = PersonConsts.NUM_BER;		
		System.out.println(numBer);
		//ʹ�þ�̬����
		int num=NUM_BER;
		System.out.println(num);
	}
	
	
	@Test
	//ʹ��test�������У�Ҫ��main��������
	public static void main(String args[]){
		/*PersonConsts pc = new PersonConsts() {
			
			@Override
			public String control(String s) {
				// TODO Auto-generated method stub
				return "abc"+s;
			}
		};*/
		//ʹ��lamdon���ʽʵ�֣�������ȼ�
		//pc�Ǹ�������������һ������
		//PersonConsts pc=(s)->{return "abc:"+s;};
		PersonConsts pc=s->"abc:"+s;
		
		System.out.println(pc.NUM_BER);
		pc.say("helo dog");
		String control = pc.control("dog");
		System.out.println(control);
		
		
	}
}
