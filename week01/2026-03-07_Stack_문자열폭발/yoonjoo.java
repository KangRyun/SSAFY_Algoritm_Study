package 자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 문자열폭발 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next(); // 문자열
		String bomb = sc.next(); // 폭발 문자열

		// 스택 생성 -> 시간초과
		// StringBuilder로 변경
		StringBuilder sb = new StringBuilder();

		// 문자를 하나씩 스택에 넣다가 폭발을 발견하면 터트리기
		for (int i = 0; i < str.length(); i++) {
			// 일단 스택에 넣기
			sb.append(str.charAt(i));

			// 폭발문자열보다 길어지면 검사 시작
			// 폭발문자열이랑 같아도 검사 시작
			if (sb.length() >= bomb.length()) {
				// 폭발 문자열인지 체크 변수
				boolean checkBoom = true;
				for (int j = 0; j < bomb.length(); j++) {
					// 문자가 하나라도 다르면 폭발물 아님!
					// stack.size() - bomb.length() -> 스택 맨 끝에서 폭발 문자열 수만큼 확인하기
					if (sb.charAt(sb.length() - bomb.length() + j) != bomb.charAt(j)) {
						checkBoom = false;
					}
				} // 폭발물 확인 끝

				// 폭발 문자열이면 폭발문자열만큼 꺼내기
				if (checkBoom) {
					sb.delete(sb.length()-bomb.length(), sb.length());
				} // 폭발 문자열 제거 완
			}

		} // for문 끝

		// 빈 문자열이면 FRULA 출력
		if (sb.length() == 0) {
			System.out.println("FRULA");
		} else {
			// 아니면 문자열 출력
			System.out.println(sb.toString());
		}
	}///main
}
