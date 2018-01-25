/**
 * 单例模式 懒汉
 */
class Singleton{
	//在单例类内部实例化该类的一个对象
	private static Singleton s = new Singleton();
	//构造函数的私有化
	private Singleton(){

	}
	//获得单例的对象
	public static Singleton getSingleton(){
		return s;
	}
}
/**
 * 单例模式 饿汉
 */
class Singleton1{
	//在单例类内部实例化该类的一个对象
	private static Singleton1 s;
	//构造函数的私有化
	private Singleton1(){

	}
	//获得单例的对象
	public static Singleton1 getSingleton1(){
		
		if(s == null){
			s = new Singleton1();
		}
		return s;
	}
}

class TestSingleton{
	public static void main(String[] args){
		Singleton s = Singleton.getSingleton();
		System.out.println(s);

		Singleton s1 = Singleton.getSingleton();
		System.out.println(s1);

		Singleton s2 = Singleton.getSingleton();
		System.out.println(s2);

		Singleton1 ss = Singleton1.getSingleton1();
		System.out.println(ss);

		Singleton1 ss1 = Singleton1.getSingleton1();
		System.out.println(ss1);

		Singleton1 ss2 = Singleton1.getSingleton1();
		System.out.println(ss2);

	}
}