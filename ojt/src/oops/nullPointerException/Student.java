package oops.nullPointerException;

public class Student {
	
	public int rno, marks;
	
	static Student obj=null;          // default static Student obj;---jvm initalizes null value
	
	private Student() {
		
	}
	
	static Student getStudent() {
		if(obj==null) {
			obj=new Student();
		}
		return obj;
	}
	
	public void show() {
		System.out.println(rno+" "+ marks);
	}
	
	

}
