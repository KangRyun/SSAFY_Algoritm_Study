import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < K; i++) {
			int num = sc.nextInt();
			// 0이면 최근에 쓴 수 지우기 - (조건: 정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장)
			if (num == 0) {
				stack.pop();
				continue;
			}

			// 0이 아니면 해당 수를 스택에 넣어둔다.
			stack.add(num);
		}

		int sum = 0;
		// 스택이 빌 때까지 더하기
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}// main

}
