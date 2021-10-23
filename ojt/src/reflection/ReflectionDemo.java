package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* 
reflection is a mechanism using which we can find out which variables and methods are present in a particular class 

for this , we use special class whose name is Class itself .
 
This Class class contains methods like getFields() , getMethods[] etc .

In order to call these methods we need object of Class class . We can't create object of class Class using constructor as it is defined as private 

Class class has provided 3 ways using which we can obtain it's object.

1)
	Class  c  = Class.forName("java.lang.String");
2)
	Class  c = String.class;
3)  
	String s = new String("java");
	Class c = s.getClass();  // getClass() is from class Object

	
	Now we can say that object of class Class will have all information about String class like which variables and methods are present in a String class	

*/ 

public class ReflectionDemo {
	
		public static void main(String[] args) throws ClassNotFoundException {
			
			Class classObject=Class.forName("java.lang.String");
			
			// classObject==> [getFields(),getMethods()] class Class object
			
		Field[] fields=	classObject.getDeclaredFields();
		
		for(Field field:fields) {
			System.out.println(field);
		}
		
		//getDeclaredMethods() will give methods which are declared inside Student class . It will not give inherited methods
		//getMethods() will give declared and inherited both methods
		
		Method[] methods=classObject.getDeclaredMethods();
		
		for(Method method:methods) {
			System.out.println(method);
		}
		
		
	}

}
