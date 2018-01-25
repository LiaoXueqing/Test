class Teacher1{
	String name;
	int age;
	public Teacher1(){
		System.out.println("父类构造器被调用");
	}
	public void sleep(){
		System.out.println(name+"老师在睡觉");
	}
}
class JavaTeacher1 extends Teacher1{
	public JavaTeacher1(){
		//super();
		System.out.println("子类构造器被调用");
	}
	public void teachJava(){
		System.out.println(name+"正在教java");
	}
}

class TestTeacher1{
	public static void main(String[] arg){
		JavaTeacher1 jt = new JavaTeacher1();
		jt.name="张三";
		jt.sleep();
		jt.teachJava();
	}
}