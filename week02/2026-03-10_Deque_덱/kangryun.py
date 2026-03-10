import sys
from collections import deque

n = int(input())
arr = deque([])

for _ in range(n):
    command = sys.stdin.readline().split()
    if command[0] == 'push_front':
        arr.appendleft(int(command[1]))
    elif command[0] == 'push_back':
        arr.append(int(command[1]))
    elif command[0] == 'pop_front':
        if arr:
            print(arr.popleft())
        else:
            print(-1)
    elif command[0] == 'pop_back':
        if arr:
            print(arr.pop())
        else:
            print(-1)
    elif command[0] == 'size':
        print(len(arr))
    elif command[0] == 'empty':
        if arr:
            print(0)
        else:
            print(1)
    elif command[0] == 'front':
        if arr:
            print(arr[0])
        else:
            print(-1)
    elif command[0] == 'back':
        if arr:
            print(arr[-1])
        else:
            print(-1)