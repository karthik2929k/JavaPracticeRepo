package com.fileInputOutput.Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.Collections.Demo.CollectionsDemo;

public class FileInputOutputDemo {
	
	
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\abc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		while(br.ready()){
			System.out.println(br.readLine());
		}
		br.close();
		
		PrintWriter pt=new PrintWriter(new FileWriter(f, true));
		for(int i=1;i<=20;i++){
			pt.println(i);
		}
		pt.close();
		
		CollectionsDemo cc=new CollectionsDemo();
		System.out.println(CollectionsDemo.name);
		CollectionsDemo.name=Thread.currentThread().getName();
		System.out.println(cc);
	}
	
}
