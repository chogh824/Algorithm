N = int(input())
K = list(map(int,input().split()))
K.sort()
print(sum(K)/K[-1] * 100 / len(K))