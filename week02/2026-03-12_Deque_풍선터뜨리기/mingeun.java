package 골드;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_풍선터뜨리기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Deque<int []> d1 = new LinkedList<>();


		for(int i=0; i<N;i++) {
			d1.add(new int [] {i+1,sc.nextInt()});
		}
		

		
		// 각 데크 별로 이제 담겨져있고 
		// 배열의 0 번에는 이제는 풍선 번호 1번에는 해당 풍선이 가지고 있는 명령이 담겨져 있다. 
		
		// 그리고 Queue 담아서 터진 풍선의 번호를 순서대로 출력을 할 예정이다 
		Queue <Integer> result = new LinkedList<>();
		
		
		while(!d1.isEmpty()) {
			int [] cur  = d1.poll();
			int balloonnum = cur[0];
		
			int move = cur[1];
			result.add(balloonnum);
			
			// 이제 움직이라는 명령이 양수 인지 음수 지에 따라서 다음 자리로 이동을 해야한다. 			
			if(move >0) {
				for(int i=0; i<move-1;i++) {
					int [] tmp = d1.pollFirst();
					int t1 = tmp[0];
					int t2 = tmp[1];
					// 다시 집어 넣어 
					d1.add(new int[] {t1,t2});
				}	
			}else {
				for(int i=0; i< Math.abs(move);i++) {
					int [] tmp = d1.pollLast();
					int t1 =tmp[0];
					int t2 = tmp[1];
					d1.add(new int[] {t1,t2});
				}
			}
		}
		
		
		while(!result.isEmpty()) {
			int tmp = result.poll();
			System.out.print(tmp+ " ");
		}
	
	
	
	
	
	
	} // main
}
