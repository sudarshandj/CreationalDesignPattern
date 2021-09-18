package singleton.pattern;

public class SingletonClass {
	
	private static SingletonClass singletonClass = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		return singletonClass;
	}
	
	public void simpleMethod() {
		System.out.println("hashcode of singleton object:"+ singletonClass);
	}
}
