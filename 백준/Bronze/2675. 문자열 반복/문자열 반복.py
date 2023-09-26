T = int(input())        # 테스트 케이스 개수 T 입력받음

for i in range(T):
    cnt, word = input().split()        # 숫자와 알파벳을 분류해서 저장
    for j in word:
        print(j*int(cnt), end='')      # 끊기는 것 없이 반복되어야 하니 end=''로 옆으로 붙이기
    print()                    # 줄 넘기는 용도