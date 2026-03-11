from collections import deque

n = int(input())
arr = list(map(int, input().split()))
ballon = deque(enumerate(arr))

result = []
for x in range(n):

    index, paper = ballon.popleft()
    result.append(index+1)
    if paper > 0:
        ballon.rotate(paper - 1)
    if paper < 0:
        ballon.rotate(paper)
    print(result)
    print(ballon)
    print(paper)
print(*result)




