package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo2 {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {

		Class classObject = Class.forName("reflection.Student"); // classObject==> [getDeclaredFields()] class Class
																	// object

		// creating object by calling default constructor

		Student obj2 = (Student) classObject.newInstance();

		System.out.println(obj2);

		Student obj3 = (Student) classObject.getConstructor().newInstance();
		System.out.println(obj3);

		Student obj4 = (Student) classObject.getDeclaredConstructor().newInstance();
		System.out.println(obj4);

		// Class classObject= Class.forName("p1.Student"); // classObject==>
		// [getDeclaredFields()] class Class object

		// creating object by calling parameterized constructor

		Class[] paramInt = { int.class, int.class };

		classObject.getDeclaredConstructor(paramInt).newInstance(1, 90);

		/* calling parameterized method */

		Class[] paramInts = { int.class, String.class };

		Method method = classObject.getDeclaredMethod("display", paramInts);
		method.invoke(obj4, 10, "Suresh");

		// calling method with 0 argument

		Method method1 = classObject.getDeclaredMethod("show");
		method1.setAccessible(true);
		method1.invoke(obj3);

		/* Accessing privare variable */
		Field field = classObject.getDeclaredField("b");
//System.out.println(obj3.b);     // private variable can not be accessed
		field.setAccessible(true);
		int a = (int) field.get(obj3);

		System.out.println(a); // 0

		field.set(obj3, 30); // using set() we can set ( change ) value of a variable

		a = (int) field.get(obj3); // 30

		System.out.println(a);

	}

}
