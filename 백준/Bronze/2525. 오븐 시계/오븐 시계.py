a, b = map(int,input().split())            # 현재 시각 입력받음
c = int(input())                           # 오븐 시간 입력받음

sum = a * 60 + b + c                       # 총 시간 계산
a = sum // 60                              # 시
b = sum % 60                               # 분

if sum >= 1440:                            # 하루를 오버했을 때, 1440을 빼기 위한 if문
    a -= 24                                
    print(a,b)

else:
    print(a,b)