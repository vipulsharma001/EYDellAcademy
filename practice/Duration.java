package com.practice;

public class Duration {
	long startvalue,endValue;
	Duration(long startValue,long endValue)
	{if(startValue>endValue)
		{throw new IllegalArgumentException("start value can never be greater than end value");
		}this.startvalue=startValue;
		this.endValue=endValue;
		}
	long duration()
	{
		return endValue-startvalue;
	}
	public static void main(String[] args) {
		Duration obj=new Duration(21,19);
		System.out.println("Duration is :"+ obj.duration());
	}
}
