package bsj.sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 변수가 어떤 범위에서 사용되는가
		
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5;		//v2 변수는 특정 블록 내부에서만 사용
		
		
	}

}
