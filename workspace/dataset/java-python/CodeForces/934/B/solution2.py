k = int(input()) if k > 36:    print(-1)    exit() res = "" res = res + "8"*(k//2) res = res + "9"*(k%2) print(res) 
