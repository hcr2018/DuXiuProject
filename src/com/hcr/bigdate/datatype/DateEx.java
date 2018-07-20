package com.hcr.bigdate.datatype;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

public class DateEx {
	@Test
	public void testArr() throws IOException{
		//���ж�ȡ�ļ�
		List<String> lines = Files.readAllLines(Paths.get("D:","Workspaces","00.txt"),Charset.forName("utf-8"));
		//16λ65536
	int[] arr=	new int[65536];
	lines.forEach(line->{
		for (char ch : line.toCharArray()) {//����һ�����ַ���
			//���ַ��������У�ch-1Ϊ�ַ������ݣ��������п�Ϊ��ch-1λ��
			//�ó�һ�����ַ���.�����ַ������������±��0��ʼ+1
			arr[ch-1]=arr[ch-1]+1;
		}
		
	});
	
	for (int i = 0; i < arr.length; i++) {
		//������ת���ַ���
		char ch=(char) (i+1);
		if(arr[i]>0){
			System.out.println(ch+"������"+arr[i]+"��");
		}
	}
			
		
	}
}
