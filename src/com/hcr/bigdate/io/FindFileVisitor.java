package com.hcr.bigdate.io;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;



public class FindFileVisitor {
	private List<String> filenameList = new ArrayList<String>();
    private String fileSuffix = null;
    public FindFileVisitor(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }
  
  
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {  
        if (file.toString().endsWith(fileSuffix)) {  
            filenameList.add(file.toString());  
        }  
        return FileVisitResult.CONTINUE;  
    }  
  
    public List<String> getFilenameList() {  
        return filenameList;  
    }  
  
    public void setFilenameList(List<String> filenameList) {  
        this.filenameList = filenameList;  
    }  

}
