a = int(input())
b = int(input())
c = b // 100
d = b % 100 // 10
e = b % 10
print(a*e)
print(a*d)
print(a*c)
print(a*c*100 + a*d*10 + a*e)