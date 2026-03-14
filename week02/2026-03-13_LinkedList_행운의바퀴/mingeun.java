package 골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class 백준_행운의바퀴 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		boolean [] isUsed = new boolean[26];
		int N = Integer.parseInt(st.nextToken()); // 바퀴 칸의 수 = 배열 칸의 수

		int K = Integer.parseInt(st.nextToken()); // 바퀴를 돌리는 횟수

		char order[] = new char[K]; // 0번 인덱스에는 한번 돌릴 떄 얼마나 돌릴 것인가? 1번에는 회전하고 난 뒤에 가르키는 글자
		int ordern [] = new int [K];
		for (int i = 0; i < K; i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			ordern[i] = Integer.parseInt(st2.nextToken());
			order[i] = st2.nextToken().charAt(0);

		}

		char[] circle = new char[N + 1];
		boolean isAwesome = true;
		int pointer = 1; // 우선은 화살표는 1번 인덱스에서 시작한다고 생각하자!
		for (int i = 0; i < K; i++) {
			int turn = ordern[i] % N;
			char add = order[i];
			pointer = pointer + turn;
			if (pointer > N) {
				pointer = pointer - N;
			}

			if (circle[pointer] == 0) { // 비어있다는 소리, 그대로 숫자를 넣어주자
				if(isUsed[add-'A']) {
					isAwesome = false;
				}
				circle[pointer] = add;
				isUsed[add-'A'] = true;
			} else { // 비교를 통해서
				if (circle[pointer] == add) {
					continue;
				} else {
					isAwesome = false;
					break;
				}
			}
		} // 몇번을 총 돌릴 것인가?
		
			
		for(int i=1;i<=N;i++) {
				if(circle[i]== '\u0000') {
					circle[i] = '?';
				}
			}
		if(!isAwesome) {
			System.out.println("!");
		}else {
			for(int i = pointer; i>=1 ; i--) {
				sb.append(circle[i]);
			}
			for(int i = N ; i>=pointer+1;i--) {
				sb.append(circle[i]);
			}
			System.out.println(sb);
		}
	
	}
}
