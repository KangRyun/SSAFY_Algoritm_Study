from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
m = int(input())
c = list(map(int, input().split()))

dq = deque()
for a, b in zip(a, b):
    if a == 0:
        dq.append(b)

res = []
for i in c:
    dq.appendleft(i)
    res.append(dq.pop())

print(*res)