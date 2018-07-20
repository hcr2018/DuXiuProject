package com.hcr.bigdate.consts;

import org.junit.Test;
/**
 * ö�ٲ�����
 * @author cjx
 *
 */
public class TestEnum {
	
	@Test
	public void test(){
		//ֱ����ö����������ö�ٳ�Ա
		PersonEnum.NUM_OF_MIDAGE.setAge(65);
		int age = PersonEnum.NUM_OF_MIDAGE.getAge();
		System.out.println("6666666:::"+age);
		
		//����getAge����
		getAge(AgeEnum.NUM_OF_MIDAGE);
	}
	
	/***
	 * ����һ����������ö�ٶ�����Ϊ����
	 * @param age
	 */
	
	public void getAge(AgeEnum age){
		switch (age) {
		case NUM_OF_CHILDAGE:
			System.out.println("����һ������");
			break;
		
		case NUM_OF_YOUNGAGE:
			System.out.println("����������");
			break;
		case NUM_OF_MIDAGE:
			System.out.println("����������������");
			break;
		case NUM_OF_OLDAGE:
			System.out.println("�������յ�������");
			break;
		default:
			break;
		}
	}
	
	@Test
	public void testMonthEnum(){
		getMonth(MonthEnum.MON_JANUARY);
	}
	
	public void getMonth(MonthEnum monEnum){
		switch (monEnum) {
		case MON_JANUARY:
			System.out.println(monEnum.getChineseName());
			break;
		}
	}
	
	@Test
	public void testAMP(){
		AMP amp = new AMP("gougou", PersonEnum.NUM_OF_MIDAGE, AgeEnum.NUM_OF_MIDAGE);
		System.out.println(amp);
	}
}
