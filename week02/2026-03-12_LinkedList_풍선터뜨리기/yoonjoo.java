package 자료구조;

import java.util.Scanner;

public class 풍선터뜨리기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 원형 이중 연결 리스트 활용
		// 마지막 노드가 첫 번째 노드를 가리키도록
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		int N = sc.nextInt();

		// 노드 추가
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		// 터진 풍선 출력하기
		while (!list.isempty()) {
			System.out.print(list.remove() + " ");
		}

	}
}

class CircularDoublyLinkedList {
	// 노드 클래스 선언
	static class Node {
		Node next;
		Node prev;
		int data;
		int id; // 풍선의 번호
		static int count = 1; // 풍선의 번호 누적용 변수

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int data) {
			this.data = data;
			id = count++;

		}

	}

	// 이중연결리스트 클래스 변수
	Node head;
	Node tail;
	int size;
	Node current; // 현재 가리키고 있는 노드

	/// 삽입 함수 - 입력값에 맞춰 순서대로 삽입할 거니까 (앞, 뒤, 중간) 구분필요X
	void add(int num) {
		Node node = new Node(num);

		// 비어있다면
		if (head == null) {
			// 처음 값도 끝 값도 나야
			head = node;
			tail = node;
			// 원형 연결이니까 내 전 노드 값도 나고 내 다음 노드 값도 나야
			node.prev = node;
			node.next = node;
			current = node; // 노드 시작점
		} else {
			// 비어있지 않다면 -> 마지막 노드 다음에 연결!
			tail.next = node; // tail 다음에 연결
			node.prev = tail; // 내 전은 tail
			node.next = head; // 이제 내가 마지막이니까 내 다음을 head로 연결
			head.prev = node; // head의 이전도 나
			tail = node; // 내가 마지막임을 표시
		}
		size++;
	}

	// 이동함수
	// 입력을 받으면 이동한 후의 현재 가리키는 노드(current) 갱신
	void move(int x) {
		// 입력값의 절댓값만큼 이동
		for (int i = 0; i < Math.abs(x); i++) {
			// 음수면 앞으로 이동
			if (x < 0) {
				current = current.prev;
			} else {
				// 양수면 뒤로 이동
				current = current.next;
			}
		}
		return;
	}

	/// 삭제 함수 - 처음, 중간, 마지막 구분
	int remove() {
		int currentId = current.id;
		// 연결 끊기
		current.prev.next = current.next;
		current.next.prev = current.prev;

		if (current == head) {
			// 첫 번째 요소 삭제할 경우
			head = current.next; // head 갱신

		} else if (current == tail) {
			// 마지막 요소 삭제할 경우
			tail = current.prev; // tail 갱신
		}
		size--;

		// 노드 이동
		move(current.data);

		return currentId;
	}

	boolean isempty() {
		return size == 0;
	}

}