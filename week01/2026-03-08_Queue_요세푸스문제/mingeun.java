package 골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 백준_요세푸스문제 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken()); // 사람 수

		int turn = Integer.parseInt(st.nextToken()); // 몇 번째 사람을 과연 나가리 시킬 것인가?

		Queue<Integer> q1 = new LinkedList<>();

		Queue<Integer> q2 = new LinkedList<>(); // 여기에 나가리 시킬 순서를 담을 예정 !

		for (int i = 1; i <= N; i++) {
			q1.add(i);
		}

		int turnCnt = 0;
		while (!q1.isEmpty()) {
			int tmp = q1.poll();
			turnCnt++;
			if (turnCnt == turn) {
				q2.add(tmp);
				turnCnt = 0;
			} else {
				q1.add(tmp);
			}

		}

		sb.append("<");

		while (!q2.isEmpty()) {
            sb.append(q2.poll());
            
          
            if (!q2.isEmpty()) {
                sb.append(", ");
            }
        }
		sb.append(">");
		System.out.println(sb);

	}
}
