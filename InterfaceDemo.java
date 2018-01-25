interface Teacher{
	public void teachLesson();
	public void smoking();
}
class TeacherImpl implements Teacher{
	public void teachLesson(){
		System.out.pringln("教课");
	}
	public void smoking(){
		System.out.pringln("抽烟");
	}
}
class InterfaceDemo{
	public static void main(String[] args){

	}
}