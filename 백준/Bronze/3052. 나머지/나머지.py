k = []        # k는 배열임을 선언

for i in range(10):
    i = int(input())
    n = i % 42        # 42의 나머지들
    k.append(n)        # 배열에 입력시킴
    
set_k = set(k)        #set 함수를 사용하여 중복되는 값 없애기
print(len(set_k))    #len 함수를 사용하여 개수 구하기