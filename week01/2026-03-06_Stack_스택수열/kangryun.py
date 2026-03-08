'''
스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.

1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다.
이를 계산하는 프로그램을 작성하라.
'''
from collections import deque

n = int(input())

# 데크를 이용해 1부터 n까지의 숫자를 스택에 넣어 확인
n_arr = deque([x for x in range(1, n + 1)])

# 맨 오른쪽이 입출력 하는 곳이니 0을 넣어 아래 비교할때 편하게
arr = deque([0])

result = []
# push나 pop을 해서 어떻게 확인?
# 스택에 해당 숫자가 들어올때 까지 계속 확인
# 숫자가 들어오면 pop 하면 되지 않나?
# 그러면 입력 수열을 배열로 저장
input_arr = [int(input()) for _ in range(n)]

for i in input_arr:
    # print(i)
    while True:
        # 비교 연산 어떻게 처리해야 되나?
        if i == arr[-1]:
            arr.pop()
            result.append('-')
            break
        else:
            if not n_arr:
                break
            arr.append(n_arr.popleft())
            result.append('+')

    # print(arr)

if len(arr) > 1:
    print('NO')

else:
    for i in range(len(result)):
        print(result[i])





