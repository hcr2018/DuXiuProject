package com.hcr.bigdate.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class WalkEx {
private FileFilter fnf;
	
	//�ڹ��캯��ִ��ʱ����
	{
		fnf=name->{
			boolean b=name.isDirectory()||name.getName().endsWith(".xml");
			return b;
		};
	}
	//�ݹ�
	@Test
	public void testIO() throws IOException {
		
		Path startingDir=Paths.get("d:\\mysql");
		FileVisitOption[] options = FileVisitOption.values();
		Stream<Path> walk = Files.walk(startingDir, options).filter(null);

		
		
		}
		
			

	/**
	 * �ո�
	 * 
	 * @param num
	 * @return
	 */
	public String getTable(int num) {
		String str = "";
		for (int i = 1; i < num; i++) {
			str += " ";
		}
		return str;

	}

	
}
