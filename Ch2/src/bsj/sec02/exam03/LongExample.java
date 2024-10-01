package bsj.sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// long 타입 변수로 컴파일러에게 long 타입임을 알림
		
		long var1 = 10;
		long var2 = 20l;
		//long var3 = 1000000000000000; <컴파일 에러
		long var4 = 1000000000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
