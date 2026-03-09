package 자료구조;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] target = new int[N];
		for (int i = 0; i < N; i++) {
			target[i] = sc.nextInt();
		} // 목표 배열 만들기

		// stack 만들기
		Stack<Integer> stack = new Stack<>();
		// 결과 담을 배열
		List<String> result = new ArrayList<>();
		boolean check = true;

		int num = 1; // 1~N까지 정수
		int idx = 0; // 타겟 수열 포인터
		while (num < N + 1 && idx < N) {

			if (num < target[idx]) {
				stack.add(num++);
				result.add("+");
				continue;
			}

			// 타겟 수열의 수와 정수값이 같으면 스택에 넣고 바로 꺼내기
			if (num == target[idx]) {
				stack.add(num++);
				result.add("+");
				stack.pop();
				result.add("-");
				idx++;
				continue;
			}

			// 타겟 수열의 수보다 정수값이 크면 스택 값 꺼내고 현재 정수값 스택에 넣어주기
			if (num > target[idx]) {
				if(!stack.isEmpty() && stack.peek() == target[idx]) {
					stack.pop();
					result.add("-");
					idx++;
					
				} else {
					check = false;
					break;
				}
			}
		} // while문 끝

		while (!stack.isEmpty()) {
			// 스택 맨 위 값이랑 타겟 값이랑 다르면
			if (stack.peek() == target[idx]) {
				// stack에 쌓인 것들 다 꺼내주기
				stack.pop();
				result.add("-");
				idx++;
			} else {
				// 스택 맨 위 값이랑 타겟 값이 다르면 check 변수 false로 바꾸고 while문 나오기
				check = false;
				break;
			}
		} // 남은 stack 값 꺼내기

		if (check) {
			for (String s : result) {
				System.out.println(s);
			}
		} else {
			System.out.println("NO");
		}

	}// main

}
