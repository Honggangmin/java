package ifexample;

public class IfTest01 {

	public static void main(String[] args) {
		// ���ǹ� - if
		int score =89;
		
		if(score >= 90) {
			System.out.printf("������%d�� �Դϴ�.",score);
			System.out.println("����� A�Դϴ�");
		}else if (score >= 80) {
			System.out.println("������ 80~89�Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		}else if (score >= 70) {
			System.out.println("������ 70~79�Դϴ�.");
			System.out.println("����� c�Դϴ�.");
		}else if (score >= 60) {
			System.out.println("������ 60~69�Դϴ�.");
			System.out.println("����� d�Դϴ�.");
		}else(score >= 80) {
			System.out.println("������ 59�� �����Դϴ�.");
			System.out.println("����� F�Դϴ�.");
		}

	}

}
