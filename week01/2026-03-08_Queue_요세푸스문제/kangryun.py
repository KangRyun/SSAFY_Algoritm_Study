from collections import deque

n, k = map(int, input().split())

queue = deque([x for x in range(1, n + 1)])

# 원형 큐에서 k-1번 회전한 후, pop()으로 제거
res = []
for _ in range(n):
    queue.rotate(-k)
    q = queue.pop()
    res.append(q)
print("<", end="")
print(*res, sep=", ", end="")
print(">", end="")
