package com.hcr.bigdate.consts;

public enum MonthEnum {
	/*
	 * һ�� Jan.January ���� Feb.February   ���� Mar.March
	 * ���� Apr.April   ���� May.May        ���� June.June  
	 * ���� July.July   ���� Aug.Aguest     ���� Sept.September 
	 * ʮ�� Oct.October ʮһ�� Nov.November ʮ���� Dec.December
	 */
	MON_JANUARY("һ��","January","Jan"),MON_FEBRUARY("����","February","Feb"),MON_MARCH("����","March","Mar"),MON_APRIL,MON_MAY;

	private String chineseName;
	private String englishName;
	private String simpleName;
	


	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getSimpleName() {
		return simpleName;
	}
	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}
	private MonthEnum(String chineseName, String englishName, String simpleName) {
		this.chineseName = chineseName;
		this.englishName = englishName;
		this.simpleName = simpleName;
	}
	
	private MonthEnum() {
		
	}
	
	
	
	
	
	

}
