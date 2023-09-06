package com.genricsexplained;


class MyGeneralisedClass<T> {
	T obj;
	void add(T obj)
	{
		this.obj=obj;
		
		
	}
	T get()
	{
		return obj;
	}
	
}
public class UseOfGenerics {
	public static void main(String[] args) {
		MyGeneralisedClass<Integer> intType = new MyGeneralisedClass<>();
		intType.add(4);
		//Compile time error will come if anything other than Integer is passed
		System.out.println(intType.get());
		
		MyGeneralisedClass<String> intType1 = new MyGeneralisedClass<>();
		intType1.add("S");
		//Compile time error will come if anything other than String is passed
		System.out.println(intType1.get());
		
		MyGeneralisedClass<Boolean> intType2 = new MyGeneralisedClass<>();
		intType2.add(true);
		//Compile time error will come if anything other than String is passed
		System.out.println(intType2.get());
		
	}
}
