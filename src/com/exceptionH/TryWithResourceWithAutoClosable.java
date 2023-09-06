package com.exceptionH;


public class TryWithResourceWithAutoClosable {
	public static void main(String[] args) {
		try {
			trywithresource();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			trywithresource();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception thrown from try with Resource ");
		}
		try {
			trywithoutresource();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			trywithoutresource();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception thrown from try with Resource ");
		}
	}

	static void trywithresource() throws Exception
	{
		try(MyResource mr = new MyResource())
		{	
			System.out.println("I am in try with Resource block");
			if(true)
			{
				throw new Exception("Exception thrown from Try with Resource");
			}
		} 
	}
	static void trywithoutresource() throws Exception
	{    MyResource mr=null;
		try
		{	mr = new MyResource();
			System.out.println("I am in try without Resource block");
			if(true)
			{
				throw new Exception("Exception thrown from Try without Resource");
			}
		} 
		finally 
		{
			if(mr!=null)
			{
				mr.close();
			}
		}
	}
	static class MyResource implements AutoCloseable
	{

		@Override
		public void close() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Close will be called Automatically for all cleanup activity");
			
		}
		
	}
}
