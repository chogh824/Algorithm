a, b = map(int,input().split())
c = int(input())

sum = a * 60 + b + c

if sum >= 1440:
    sum -= 1440
    a = sum // 60
    b = sum % 60
    print(a,b)

else:
    a = sum // 60
    b = sum % 60
    print(a,b)