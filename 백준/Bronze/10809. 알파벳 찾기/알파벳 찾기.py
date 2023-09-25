S = list(input())                # 알파벳 입력받는 코드
c = 'abcdefghijklmnopqrstuvwxyz'        # 전체 알파벳 리스트를 c로 선언

for i in c:                      # 반복문
    if i in S:                    # S 안에 있는 알파벳의 인덱스를 저장해놨다가 인덱스 위치 출력
        print(S.index(i), end = ' ')    # 1칸 띄워야 되므로 end=' '는 필수!
    else:                          # 숫자가 없다면 -1 출력
        print(-1, end = ' ')