# 백준 1158 - 요세푸스
# 원형 큐 사용

from collections import deque

N, K = map(int, input().split())
q = deque(range(1, N+1))
result = []

while q:
    for i in range(K-1): # K번째 사람을 제거하기 전에 앞의 K-1명을 뒤로 보냄 
        q.append(q.popleft()) # 맨 앞 사람을 꺼내서 맨 뒤에 다시 넣음 
    result.append(q.popleft()) # 맨 앞에 있는 사람 = K번째 사람 => 제거 / result에 저장 

print("<" + ", ".join(map(str, result)) + ">")
