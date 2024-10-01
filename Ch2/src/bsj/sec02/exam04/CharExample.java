package bsj.sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		// Char 타입 예제 (''작은 따옴표 사용)
		
		char c1 = 'A';				//문자를 직접 저장
		char c2 = 65;				//10진수로 저장
		char c3 = '\u0041';			//16진수로 저장
		
		char c4 = '가';				//문자를 직접 저장
		char c5 = 44032;			//10진수로 저장
		char c6 = '\uac00';			//16진수로 저장

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			System.out.println(c5);
			System.out.println(c6);
	}

}
