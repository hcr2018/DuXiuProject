package com.hcr.bigdate.consts;

/**
 * ö����
 * @author cjx
 *
 */
public enum PersonEnum {
	//ö�ٳ�Ա������ֵ
	NUM_OF_CHILDAGE(10),NUM_OF_YOUNGAGE(25),NUM_OF_MIDAGE(60),NUM_OF_OLDAGE(80);
	//����
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * ˽�й��췽��
	 * @param age
	 */
	private PersonEnum(int age) {
		this.age = age;
	}
	
	
	

}
