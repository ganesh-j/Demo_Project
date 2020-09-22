package com.demo.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.demo.reflection.Test");
			
			Object obj = (Test)c.getDeclaredConstructor().newInstance();
			
			Method m = c.getDeclaredMethod("msg", new Class[] {String.class,int.class});
			
			m.setAccessible(true); // providing access
			m.invoke(obj, "Parameter",10);
			
			
			//Test t = new Test();
			//t.msg("akhjk",19);
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
