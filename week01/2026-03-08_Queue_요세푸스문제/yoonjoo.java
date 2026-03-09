package 자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 사람 수
		int K = sc.nextInt(); // 제거할 순서

		Queue<Integer> que = new LinkedList<>();

		// 일단 1~N 순서대로 넣기
		for (int i = 1; i <= N; i++) {
			que.add(i);
		}

		System.out.print("<");
		// 사람이 queue에 없을 때까지 반복
		while (!que.isEmpty()) {
			// K-1번만큼 뽑아서 맨 뒤에 다시 넣기
			for (int i = 0; i < K - 1; i++) {
				que.add(que.poll());
			}

			// K번째는 출력
			System.out.print(que.poll());

			// 다음 출력값이 있다면 , 찍어주기
			if (!que.isEmpty()) {
				System.out.print(", ");
			}
		} // while문 끝

		System.out.print(">");

	}// main
}
