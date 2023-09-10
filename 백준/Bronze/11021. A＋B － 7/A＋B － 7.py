import sys            # sys 모듈 불러들이기

T = int(sys.stdin.readline())

for i in range(1,T+1):
    a,b = map(int, sys.stdin.readline().split())
    print(f'Case #{i}: {a+b}')    #f-string: 따옴표 안에 {} 괄호를 입력하고 괄호 안에 변수나 변수를 연산한 값을 입력할 수 있음