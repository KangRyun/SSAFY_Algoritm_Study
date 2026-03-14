package 골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_트리순회 {

	static int N;
	static char[][] tree;
	static StringBuilder presb = new StringBuilder();
	static StringBuilder insb = new StringBuilder();
	static StringBuilder postsb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine()); // 노드의 개수

		tree = new char[N + 1][3]; // 0번은 해당 노드에 대한 문자
									// 1번은 왼좌
									// 2번은 오른좌

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());

			tree[i][0] = st.nextToken().charAt(0);
			tree[i][1] = st.nextToken().charAt(0);
			tree[i][2] = st.nextToken().charAt(0);

		}

		preorder(1);
		inorder(1);
		postorder(1);
		System.out.println(presb);
		System.out.println(insb);
		System.out.println(postsb);
	} // main

//전위
	static void preorder(int v) {
		// 종료 조건
		if (v==0) {
			return;
		}
		presb.append(tree[v][0]);
		preorder(search(tree[v][1])); // 왼좌
		preorder(search(tree[v][2]));
	}

//중위
	static void inorder(int v) {
		// 종료 조건
		if (v==0) {
			return;
		}
		inorder(search(tree[v][1])); // 왼좌
		insb.append(tree[v][0]);
		inorder(search(tree[v][2]));
	}

//후위
	static void postorder(int v) {
		// 종료 조건
		if (v==0) {
			return;
		}
		postorder(search(tree[v][1])); // 왼좌
		postorder(search((tree[v][2])));
		postsb.append(tree[v][0]);
	}

//찾는 메서드 
	static int search(char c) {
		if (c == '.') {
			return 0;
		}
		for (int i = 1; i <= N; i++) {
			if (tree[i][0] == c) {
				return i;
			}
		}
		return 0;
	}
}
