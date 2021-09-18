package singleton.pattern;

import factory.pattern.Teacher;

public class MainClass {

	public static void main(String[] args) {
		
		SingletonClass singletonClass = SingletonClass.getInstance();
		singletonClass.simpleMethod();
		
		SingletonClass singletonClass2 = SingletonClass.getInstance();
		singletonClass2.simpleMethod();
		
		Teacher teacher1 = new Teacher();
		System.out.println(teacher1);
		
		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);
	}

}
