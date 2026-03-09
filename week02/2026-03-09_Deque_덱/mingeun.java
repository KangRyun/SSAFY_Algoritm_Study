package 골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 백준_덱 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); // 명령어 개수
		Deque deque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String order = st.nextToken();
			if (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());

				if (order.equals("push_front")) {
					deque.addFirst(num);
				} else if (order.equals("push_back")) {
					deque.addLast(num);
				}

			} else {
				if (order.equals("pop_front")) {
					if (!deque.isEmpty()) {
						System.out.println(deque.pollFirst());
					} else {
						System.out.println(-1);
					}
				} else if (order.equals("pop_back")) {
					if (!deque.isEmpty()) {
						System.out.println(deque.pollLast());
					} else {
						System.out.println(-1);
					}
				} else if (order.equals("size")) {
					System.out.println(deque.size());
				} else if (order.equals("empty")) {
					if (deque.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				} else if (order.equals("front")) {
					if (!deque.isEmpty()) {
						System.out.println(deque.peekFirst());
					} else {
						System.out.println(-1);
					}
				} else {
					if (!deque.isEmpty()) {
						System.out.println(deque.peekLast());
					} else {
						System.out.println(-1);
					}
				}
			}
		}
	}
}
