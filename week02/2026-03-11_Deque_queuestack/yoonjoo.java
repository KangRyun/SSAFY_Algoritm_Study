package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class queuestack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 자료구조의 개수
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] structures = new int[N];
		for (int i = 0; i < N; i++) {
			structures[i] = Integer.parseInt(st.nextToken());
		}

		Deque<Integer> q = new ArrayDeque<>();

		// stack은 push하고 바로 pop하면 들어오자마자 나가져서 영향이 없음
		// queue는 새로운 값이 들어오고 기존에 있는 값이 나가므로
		// queue 자료구조만 모아서 붙이면 거대한 queue 형태로 작동하게 됨

		// queue인 자료구조만 받아서 q에 넣어주기
		// 거꾸로 넣어줘야 함
		// 문제에서는 가장 마지막 원소가 가장 처음 쌓여있다고 판단
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			if (structures[i] == 0) {
				q.addFirst(Integer.parseInt(st.nextToken()));
			} else {
				st.nextToken();
			}
		}

		// 삽입할 원소의 개수
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 원소 삽입
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			q.add(Integer.parseInt(st.nextToken()));
			sb.append(q.poll()).append(" ");
		}

		System.out.print(sb.toString());
	}// main
}
