class Demo2 {
	public static void  main(String[] args){
	byte  a = 127;
 	
     int b = a+1;
	System.out.println(b);
	
	short s = 30;
	
	int s1 = s+2;
	System.out.println(s1);

	char c ='a';
	
	int d = c+3;
	System.out.println(d);
	int e =a+s;
	int f = a+c;
	System.out.println(f);
	int g =2;
	long l = g+1;
	System.out.println(l);


	int m = 4;
	switch(m){
		case 2:
		System.out.println("2!");
		break;
		default:
		System.out.println("default!");
		break;
		case 4:
		System.out.println("4!");
		break;

	}




	}
}