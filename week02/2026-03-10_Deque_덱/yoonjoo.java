package 자료구조;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		deque d = new deque();

		// 명령 개수
		int N = sc.nextInt();

		// 명령 수행
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push_front":
				d.push_front(sc.nextInt()); // push 계열은 뒤에 오는 숫자까지 읽기
				break;
			case "push_back":
				d.push_back(sc.nextInt());
				break;
			case "pop_front":
				System.out.println(d.pop_front());
				break;
			case "pop_back":
				System.out.println(d.pop_back());
				break;
			case "size":
				System.out.println(d.size());
				break;
			case "empty":
				System.out.println(d.empty());
				break;
			case "front":
				System.out.println(d.front());
				break;
			case "back":
				System.out.println(d.back());
				break;
			}// switch-case 끝
		} // for문 끝
	}// main
}

class deque {
	Node rear; // 맨 뒤 노드
	Node front; // 맨 앞 노드
	int size; // 덱에 들어있는 원소의 개수

	// Node 클래스 정의
	class Node {
		int data; // 데이터
		Node link; // 다음 노드

		// 생성자
		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int data) {
			this.data = data;
		}
	}

	//// 메서드 만들기 ////
	// push_front X: 정수 X를 덱의 앞에 넣는다.
	int push_front(int X) {
		// 새로 넣을 노드 객체 생성
		Node node = new Node(X);

		// 덱이 비어 있으면 front와 rear 모두 첫 요소를 가리킴
		if (empty() == 1) {
			front = node;
			rear = node;
		} else {
			// 덱이 비어 있지 않으면
			// 새로운 노드 링크(다음 노드)에 현재 맨 앞에 노드 연결시켜주고
			node.link = front;
			// front가 새로운 노드를 가리키게 변경
			front = node;
		}
		size++; // 덱의 원소 사이즈 증가
		return X;
	}

	// push_back X: 정수 X를 덱의 뒤에 넣는다.
	int push_back(int X) {
		Node node = new Node(X);
		// 비어 있으면, rear랑 front 모두 새로운 노드를 바라봄
		if (empty() == 1) {
			front = node;
			rear = node;
		} else {
			// 비어 있지 않으면
			// rear.link에 새로운 노드 연결하고
			rear.link = node;
			// rear가 새로운 노드를 가리키게 변경
			rear = node;
		}
		size++; // 덱의 원소 사이즈 증가
		return X;
	}

	// pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다.
	// 만약, 덱의 들어있는 정수가 없는 경우에는 -1을 출력한다.
	int pop_front() {
		if (empty() == 1) {
			// 비어 있으면 -1 출력
			return -1;
		} else {
			// 비어 있지 않으면 front의 데이터값을 출력하고
			int data = front.data;
			// front가 가리키는 것을 다음 노드로 변경
			front = front.link;
			// 꺼낸 노드가 마지막 노드였다면 rear도 null로 바꿔주기
			if (front == null) {
				rear = null;
			}
			size--; // 덱의 사이즈 감소
			return data;
		}
	}

	// pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다.
	// 만약, 덕에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	int pop_back() {
		if (empty() == 1) {
			// 비어 있으면 -1을 출력
			return -1;
		}

		// 비어 있지 않다면, rear에 데이터 값 출력
		int data = rear.data;
		// 원소가 하나였다면
		if (front == rear) {
			front = null;
			rear = null;
		} else {
			// 원소개 2개 이상이라면
			// rear 위치 -> rear 전 노드까지로 이동
			// 일단 rear 바로 전 노드 찾기
			Node curr = front;
			while (curr.link != rear) {
				curr = curr.link;
			} // 찾기 완

			// 삭제할 노드 연결 끊기
			curr.link = null;
			// rear 위치 변경
			rear = curr;
		}
		size--;
		return data;
	}

	// size: 덱에 들어있는 정수의 개수를 출력한다.
	int size() {
		return size;
	}

	// empty: 덱이 비어있으면, 1을 아니면 0을 출력한다.
	int empty() {
		if (rear == null) {
			return 1;
		} else {
			return 0;
		}
	}

	// front: 덱의 가장 앞에 있는 정수를 출력한다.
	// 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	int front() {
		if (empty() == 1) {
			// 비어 있을 경우
			return -1;
		} else {
			return front.data;
		}
	}

	// back: 덱의 가장 뒤에 있는 정수를 출력한다.
	// 만약 덱에 들어있는 정수가 없는 경우네는 -1을 출력한다.
	int back() {
		if (empty() == 1) {
			return -1;
		} else {
			return rear.data;
		}
	}

}// deque class 정의 완
