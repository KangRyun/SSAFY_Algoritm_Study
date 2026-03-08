package 골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 백준_제로 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(bf.readLine()); // 정수 K

		Queue<Integer> list = new LinkedList<>();  // 입력 값을 받을 큐

		Stack<Integer> saved = new Stack<>();     // 출력을 위한 스택

		for (int i = 0; i < K; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}

		// list에 있는 큐가 텅텅 비어있을 때 까지 반복문을 돌릴 예정!
		while (!list.isEmpty()) {
			int tmp = list.poll();

			if (tmp == 0) {
				if (!saved.isEmpty()) {
					// saved에 들어 있는걸 뽑아버리자
					saved.pop();
				}else {
					saved.add(tmp);
				}
			} else {
				saved.add(tmp);
			}
		}

		// 남아있는 걸 전부 더해보자
		int sum = 0;
		while (!saved.isEmpty()) {
			int tmp = saved.pop();
			sum = sum + tmp;
		}
		System.out.println(sum);
	} // main
}
