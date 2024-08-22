a,b = map(int,input().split())                 #input 받을 값 코딩함

a_list = list(map(int,input().split()))        #list값 입력

for i in range(a):                            #for문으로 반복처리
    if a_list[i] < b:                        #조건문
        print(a_list[i], end=' ')