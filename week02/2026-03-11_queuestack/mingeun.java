package 골드;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 백준_queuestack {
	public static void main(String[] args) throws Exception {
		// Scanner 대신 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine()); // 자료 구조의 개수
		int stackcnt = 0;
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = tmp;
			if (tmp == 0) {
				stackcnt++;
			}
		}
		
		int[] value = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		int A = Integer.parseInt(br.readLine()); // 삽입할 열의 개수

		Queue<Integer> push = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			push.add(Integer.parseInt(st.nextToken()));
		}
	
		int[] onlystack = new int[stackcnt];
		int idx = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == 0) {
				onlystack[idx] = i;
				idx++;
			}
		}
		// onlystack 안에 들어가 있는게 지금 0인 배열의 값들이 들어가 있는거잖아 
		// 그럼이제 스택이 친구들 했고 이 친구들 뒤에서부터 빼야해!! 그리고 나서
		// 스택의 개수에서 -1 만큼 한거를 빼줘라 이거 아인교?
		int count = 0;
		for (int i = stackcnt - 1; i >= 0 && count < A; i--) {
		    sb.append(value[onlystack[i]]).append(" ");
		    count++;
		}

		// 2. 만약 A개를 다 못 채웠다면, 그때서야 새로 넣은 원소(push)를 순서대로 출력한다.
		while (count < A) {
		    sb.append(push.poll()).append(" ");
		    count++;
		}
	
		System.out.println(sb);
	}
}