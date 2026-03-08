# 백준 1874 - 스택수열
# 타겟 숫자가 나올 때까지 push -> 스택 top이 타겟이면 pop해서 꺼냄 


N = int(input())
stack = []
result = []
current = 1 

for i in range(N):
    a = int(input())
    while current <= a:
        stack.append(current)
        result.append("+")
        current += 1
    if stack[-1] == a:
        stack.pop()
        result.append("-")
    else:
        print("NO")
        exit()

for r in result:
    print(r)
