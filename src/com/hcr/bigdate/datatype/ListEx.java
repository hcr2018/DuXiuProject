package com.hcr.bigdate.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ListEx {
	@Test
	public void testList(){
		
		List<String> asList = Arrays.asList("aa","bb","cc","gd");
		/*//ʹ�õ������������
		Iterator<String> iterator = asList.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}*/
		
		//ʹ��foreach���
		for (String str : asList) {
			System.out.println(str);
		}
	}
	
	
	@Test
	public void testArrayList(){
		//��ʼ������СΪ10
		List<String> arrayList = new ArrayList<>(10);
		arrayList.add("aa");
		arrayList.add("bb");
		arrayList.add("bb");
		arrayList.add("an");
		arrayList.add("bd");
		arrayList.add("br");
		//arrayList.forEach(list->System.out.println(list));
		arrayList.forEach(System.out::println);
		//arrayList.replaceAll("bd","");
		
		//set(int index, E element)
		//Replaces the element at the specified position in this list with the specified element.
		arrayList.set(1, "hh");
		arrayList.forEach(System.out::println);
		
		//
		arrayList.remove("an");
		arrayList.forEach(System.out::println);
		//���ֵ�˳��Ƚ�
		arrayList.sort((s1,s2)->s1.compareTo(s2));
		
		//�Ȱ����ȱȽϣ����ֵ�˳������
		Comparator<Object> cr = Comparator.comparingInt(s->s.toString().length()).thenComparing((s1,s2)->s1.toString().compareTo(s2.toString()));
		arrayList.sort(cr);
		arrayList.forEach(list->System.out.println(list));
		
	}
}
