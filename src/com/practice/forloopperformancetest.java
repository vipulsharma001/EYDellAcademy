package com.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class forloopperformancetest {
	static List<Integer> list=new ArrayList<>();
	static long startTime,endTime;
	static {
		for(int i=0;i<1000000;i++)
		{
			list.add(i);
		}
	}
public static void main(String[] args)
{
	startTime=Calendar.getInstance().getTimeInMillis();
	for(int i: list) {};
	endTime=Calendar.getInstance().getTimeInMillis();
	System.out.println("advanced for loop =" + (endTime-startTime)+"ms");
	
	startTime=Calendar.getInstance().getTimeInMillis();
	for(int i=0;i<list.size();i++) {};
	endTime=Calendar.getInstance().getTimeInMillis();
	System.out.println("basic loop with fun =" + (endTime-startTime)+"ms");
	
	startTime=Calendar.getInstance().getTimeInMillis();
	int size=list.size();
	for(int i=0;i<size;i++) {};
	endTime=Calendar.getInstance().getTimeInMillis();
	System.out.println("basic loop with variable =" + (endTime-startTime)+"ms");
	
	startTime=Calendar.getInstance().getTimeInMillis();
	for(int i=size;i>0;i--){};
	endTime=Calendar.getInstance().getTimeInMillis();
	System.out.println("basic loop when run backwards =" + (endTime-startTime)+"ms");
	
}
}
