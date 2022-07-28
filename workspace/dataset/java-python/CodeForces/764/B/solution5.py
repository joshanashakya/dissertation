x=int(input(''))ar=list(map(int, input('').split())) for i in range(0, x//2,2):    ar[i],ar[-i-1]=ar[-i-1],ar[i] print(*ar)
