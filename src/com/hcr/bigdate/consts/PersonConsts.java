package com.hcr.bigdate.consts;

//ʹ��@FunctionalInterface�������ӿ���ֻ����һ�����󷽷�
@FunctionalInterface
public interface PersonConsts {
	
	//�ڽӿ��������ı���������public/final/static
	public static final int NUM_BER=4;
	/**
	 * ���󷽷�
	 * @param content
	 * @return
	 */
	public abstract String control(String content);
	//String control(String contene);//�ȼ�����һ�д���
	
	/**
	 * Ĭ�Ϸ���
	 * @param content
	 */
	default public void say(String content){
		
		System.out.println(content);
	}

}
