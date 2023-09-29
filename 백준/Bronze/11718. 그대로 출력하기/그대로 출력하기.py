while True:                #무한 반복문
    try:
        print(input())
    except EOFError:        #End Of File 상태라면 break문 걸어주기!
        break
    