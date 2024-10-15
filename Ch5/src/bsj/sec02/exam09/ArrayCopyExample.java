package bsj.sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// System.arraycopy() 메소드로 배열 복사
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
			System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}

	}

}
