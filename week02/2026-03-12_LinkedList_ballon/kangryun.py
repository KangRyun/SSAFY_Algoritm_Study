from collections import deque

n = int(input())
arr = list(map(int, input().split()))

# 인덱스 값과 배열 값을 저장
ballon = deque(enumerate(arr))

result = []
for x in range(n):

    index, paper = ballon.popleft()
    result.append(index+1)
    # rotate 인자에 음수가 들어가면 배열이 왼쪽으로 회전
    # 따라서 음수를 붙혀줘야 요구사항대로 출력 가능
    if paper > 0:
        ballon.rotate(-(paper - 1))
    if paper < 0:
        ballon.rotate(-paper)

print(*result)




