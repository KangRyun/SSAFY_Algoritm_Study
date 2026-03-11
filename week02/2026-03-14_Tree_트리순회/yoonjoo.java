package baeckjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 트리순회 {
	static int[][] tree;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 트리 배열 만들기
		N = sc.nextInt();
		sc.nextLine();
		// 0열 왼자
		// 1열 오자
		// 부모는 인덱스로 확인
		// 알파벳을 숫자로 변환하여 인덱스로 사용하기
		tree = new int[27][2];

		// 한줄씩 읽어서 처리
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			// 부모 먼저 받기 - 알파벳을 인덱스로 변환
			int parent = st.nextToken().charAt(0) - 'A' + 1;
			// 왼자가 있으면 왼자 받기
			String left = st.nextToken();
			if (!left.equals(".")) {
				tree[parent][0] = left.charAt(0) - 'A' + 1;
			}
			// 오자가 있으면 오자 받기
			String right = st.nextToken();
			if (!right.equals(".")) {
				tree[parent][1] = right.charAt(0) - 'A' + 1;
			}
		} // 트리 배열 완성

		preOrder(1); // 전위순회
		System.out.println();
		inOrder(1); // 중위순회
		System.out.println();
		postOrder(1); // 후위순회

	}// main

	// V -> L -> R
	static void preOrder(int v) {
		// 종료 파트
		// 아무것도 없을 때 종료 (비어 있음을 0으로 표현함)
		if (v == 0) {
			return;
		}
		// 부모 노드 출력
		System.out.print((char) (v + 'A' - 1));

		// 재귀 파트
		// 출력할 때 문자로 변경하기 + 'A'-1 해주고 char로 명시적 형변환 해주기
		// 왼자 탐색
		preOrder(tree[v][0]);
		// 오자 탐색
		preOrder(tree[v][1]);
	}// 전위순회

	// L -> V -> R
	static void inOrder(int v) {
		// 종료 파트
		if (v == 0) {
			return;
		}

		// 재귀파트
		// 왼자 탐색
		inOrder(tree[v][0]);
		// 부모 노드 출력
		System.out.print((char) (v + 'A' - 1));
		// 오자 탐색
		inOrder(tree[v][1]);
	}// 중위순회

	static void postOrder(int v) {
		// 종료 파트
		if (v == 0) {
			return;
		}

		// 재귀파트
		// 왼자탐색
		postOrder(tree[v][0]);
		// 오자탐색
		postOrder(tree[v][1]);
		// 부모 노드 출력
		System.out.print((char) (v + 'A' -1));

	}// 후위 순회

}
