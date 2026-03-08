# 백준 10773-제로 
# stack에 입력값 하나씩 넣기 -> 0 넣으면 그 앞에 값 빼기 -> 스택에 남은 숫자들 더하기 

K = int(input())
stack = []

for i in range(K):
    a = int(input())
    if a == 0:
        stack.pop()
    else:
        stack.append(a)

print(sum(stack))