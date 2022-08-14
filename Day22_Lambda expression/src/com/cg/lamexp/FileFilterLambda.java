package com.cg.lamexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
       FileFilter obj=(File pathname)-> pathname.getName().endsWith(".xlsx");
       File dir=new File("C:\\Users\\admin\\OneDrive\\Documents");
       File[] contents=dir.listFiles(obj);
       for(File i:contents)
       {
    	   System.out.println(i);
       }
	}

}
