package bsj.sec01.exam03;

public class VariableExcahngeExample {

	public static void main(String[] args) {
		//  두 변수의 값을 교환하는 방법
		
		int x =3;
		int y = 5;
			System.out.println("x : " + x + ", y : " + y);
			
			
		int temp = x;			//변수 x 값 3을 변수 temp에 저장
		x = y;					//변수 y 값 5를 변수 x에 저장
		y = temp;				//변수 temp 값 3을 변수 y에 저장
			System.out.println("x : " + x + ", y : " + y);
			
	}

}
