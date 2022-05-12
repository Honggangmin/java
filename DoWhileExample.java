package whileExample;

public class DoWhileExample {

	public static void main(String[] args) {
		//반복문 do~while 실행문을 무조건 한번은 실행
		
		int i = 111;
		int sum = 0;
		
		
		do {
			sum +=1;
			i++;
			while(i<=100);
			System.out.println(sum);
			System.out.println(i);
		}

	}

}
