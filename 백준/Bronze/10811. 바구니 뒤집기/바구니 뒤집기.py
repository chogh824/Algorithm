N,M = map(int,(input().split()))    # N과 M 입력받음
basket = [i for i in range(1, N+1)]    #바구니에 들어갈 숫자 입력함
temp = 0                                #temp 변수 초기화

for k in range(M):
    i,j = map(int,input().split())    #i,j 입력받음
    temp = basket[i-1:j]
    temp.reverse()
    basket[i-1:j] = temp
        
for i in range(N):
    print(basket[i], end= ' ')