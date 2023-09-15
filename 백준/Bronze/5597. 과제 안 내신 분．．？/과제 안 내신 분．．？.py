Num = [i for i in range (1,31)]    #1부터 30까지의 리스트 생성

for i in range(28):
    n = int(input())
    Num.remove(n)        #remove 함수를 이용한 소거
    
print(min(Num))
print(max(Num))
