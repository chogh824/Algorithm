sum = int(input())
A = int(input())
compare_sum = 0

for i in range(A):
    price,num = map(int,input().split())
    summ = price * num
    compare_sum += summ

if sum == compare_sum:
    print('Yes')
else:
    print('No')