package bsj.sec02.exam02;

public class ByteExample {

	public static void main(String[] args) {
		// byte 타입 변수에 허용 범위를 초과한 값을 대입한 경우 컴파일 에러
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 128;	// 정수 리터럴이 int 타입의 허용범위를 초과 - 컴파일 에러
										//long 타입임을 컴파일러에게 알려야함 - 정수 리터럴 뒤에 L

		
			System.out.println(var1);
			System.out.println(var2);
			System.out.println(var3);
			System.out.println(var4);
			System.out.println(var5);
			System.out.println(var6);
		
	}

}
