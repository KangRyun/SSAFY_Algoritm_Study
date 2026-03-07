package 골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 백준_문자열폭발_9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String st = bf.readLine();
		String bomb = bf.readLine();
		StringBuilder sb = new StringBuilder();

		char[] bombcheck = new char[bomb.length()];
		for (int i = 0; i < bomb.length(); i++) {
			bombcheck[i] = bomb.charAt(bomb.length() - 1 - i);
		}
		// 스택은 꺼낼때 가장 최신것부터 꺼내므로 이걸 차배열을 뒤집어서 확인을 해주어야 한다.

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			stack.push(c);
			if (stack.size() >= bombcheck.length) {
				// 비교를 하자
				boolean isBomb = true;
				for (int j = 0; j < bombcheck.length; j++) {
					char tmp = stack.get(stack.size()-1-j);
					if (tmp != bombcheck[j]) {
						isBomb = false;
						break;
					}
				}
				if (isBomb) {
					for (int j = 0; j < bombcheck.length; j++) {
						stack.pop();
					}
				}

			}
		}

		if (stack.isEmpty()) {
			System.out.println("FRULA");
		} else {
			while (!stack.isEmpty()) {
				sb.append(stack.pop());
			}

			System.out.println(sb.reverse());
		}

	}
}
