N,M = map(int,input().split())        # N과 M을 입력받음
basket = [0] * (N+1)                    #바구니를 배열함
for n in range(M):    #M번 반복
    i,j,k = map(int,input().split())    #i,j,k 입력받음
    for m in range(i,j+1):    #i부터 j번 바구니까지 반복
        basket[m] = k         #m번 바구니를 k로 지정

for i in range(1,N+1):
    print(basket[i], end= ' ')