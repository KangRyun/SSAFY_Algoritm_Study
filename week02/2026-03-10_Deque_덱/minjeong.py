# 백준 - 10866 - 덱 
import sys
from collections import deque
input = sys.stdin.readline

q = deque()

N = int(input())
for _ in range(N):
    line = input().split()
    func = line[0]

    if func == 'push_back':
        q.append(line[1])
    elif func == 'push_front':
        q.appendleft(line[1])
    elif func == 'pop_front':
        print(q.popleft() if q else -1)
    elif func == 'pop_back':
        print(q.pop() if q else -1)
    elif func == 'size':
        print(len(q))
    elif func == 'empty':
        if len(q)==0:
            print(1)
        else:
            print(0)
    elif func == 'front':
        print(q[0] if q else -1) 
    elif func == 'back':
        print(q[-1] if q else -1)