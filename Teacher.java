class Teacher{
	String name;
	int age;
	public void sleep(){
		System.out.println(name+"老师在睡觉");
	}
}
class JavaTeacher extends Teacher{
	public void teachJava(){
		System.out.println(name+"正在教java");
	}
}
class PHPTeacher extends Teacher{
	public void teachPHP(){
		System.out.println(name+"正在教PHP");
	}

}
class TestTeacher{
	public static void main(String[] arg){
		JavaTeacher jt = new JavaTeacher();
		jt.name="张三";
		jt.sleep();
		jt.teachJava();

		PHPTeacher pt = new PHPTeacher();
		pt.name="李四";
		pt.sleep();
		pt.teachPHP();
	}
}