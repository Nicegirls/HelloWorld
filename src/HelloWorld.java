import java.util.ArrayList;

public class HelloWorld {
	public static void main(String[]args){
//		int a = 10;
//		int c = 10;
//		do{
//			--c;
//			a=a-1;
//		}while(a>0);
//		System.out.println(c);
//		int []a = new int[3];
//		int i = a.length;
//		int a = 1;
//		int b =10;
//		do{
//			b-=a;
//			a++;
//		}while(b--<0);
//		System.out.println(b);
		System.out.println();
		Test t = new Test();
//		System.out.println(t.f());
		System.out.println(t.getValue(2));
		ArrayList al = new ArrayList();
		long temp = (int)3.9;
		temp%=2;
		System.out.println(temp);
		int a = 10;
		int m = 5;
		m = ++a*m;
		System.out.println(m);
	}
}
class Test extends Thread{
	public int f(){
		int i = 0;
		try{
			++i;
		}finally{
			++i;
		}
		return ++i;
	}
	public static int getValue(int i){
		int result = 0;
		switch(i){
		case 1:
			result = result+i;
		case 2:
			result = result+i+2;
		case 3:
			result = result+i+3;
		}
		return result;
	}
}
