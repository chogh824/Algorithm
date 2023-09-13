n = int(input())            #배열의 구성 입력받기

n_list = list(map(int,input().split()))    #각자 띄어서 입력받기
v = int(input())    #숫자 입력받기

print(n_list.count(v))    #입력 받은 숫자가 그 배열에 몇 개 있는지 출력