package bsj.sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		// 이스케이프 문자 출력 예제
		
		System.out.println("번호 \t 이름 \t 직업");			//탭 만큼 띄움 \t
			
		System.out.println("행 단위 출력 \n");				//줄 바꿈 \n
		System.out.println("행 단위 출력\n");
		
		System.out.println("우리는 \"개발자\" 입니다.");		// "(큰 따옴표) 출력 \"
		System.out.println("봄\\여름\\가을\\겨울\\");		// \ 출력 \\

	}

}
