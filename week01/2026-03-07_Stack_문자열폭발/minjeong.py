# 백준 9935 - 문자열 폭발 
# 스택 마지막 부분이 폭발 문자열인지 체크 
# 폭발 문자열 길이만큼 pop

N = input()
target = input()
stack = []
target_len = len(target)

for ch in N:
    stack.append(ch)
    if "".join(stack[-target_len:]) == target:
        for _ in range(target_len):
            stack.pop()

result = "".join(stack)
if result:
    print(result)
else:
    print("FRULA")
