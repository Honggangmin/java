package ifexample;

public class IfTest01 {

	public static void main(String[] args) {
		// 조건문 - if
		int score =89;
		
		if(score >= 90) {
			System.out.printf("점수가%d점 입니다.",score);
			System.out.println("등급은 A입니다");
		}else if (score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}else if (score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 c입니다.");
		}else if (score >= 60) {
			System.out.println("점수가 60~69입니다.");
			System.out.println("등급은 d입니다.");
		}else(score >= 80) {
			System.out.println("점수가 59점 이하입니다.");
			System.out.println("등급은 F입니다.");
		}

	}

}
