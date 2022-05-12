package whileExample;

public class BreakTest {

	public static void main(String[] args) {
		// break - 제어문 실행 중지
		
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}

	}

}
