package 골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 백준_스택수열_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());

		StringBuilder sb = new StringBuilder();

		Stack<Integer> s1 = new Stack<>();
		int current = 1;
		boolean isSequence = true;

		for (int i = 0; i < N; i++) {
			int target = Integer.parseInt(bf.readLine());

			if (current <= target) {
				while (current <= target) {
					s1.push(current++);
					sb.append("+\n");
				}
					s1.pop();
					sb.append("-\n");
		
			} else {
				if (s1.peek() == target) {
					s1.pop();
					sb.append("-\n");
				} else {
					isSequence = false;
					break;
				}
			}

		}

		if (isSequence) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
}
