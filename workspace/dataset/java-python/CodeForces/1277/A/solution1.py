r = lambda : list(map(int, input().split()))t = int(input())for _ in range(t):    n = int(input())    c = 0    for i in range(1 , 10):        j = 1        while int(str(i)*j) <= n:            c+=1            j+=1     print(c)                    
