for _ in range(1):    n = int(input())    arr = list(map(int , input().split()))    g = 1    for i in range(n):        if arr[i] < 0:            g = 0            break         if arr[i] % 2 == 0:            pass        else:            if i < n -1:                arr[i + 1] -= 1                        else:                g = 0     if g == 0:        print("NO")    else:        print("YES")    