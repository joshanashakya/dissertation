v = int(input())a = list(map(int, input().split())) mincost = min(a)dig = v // mincost if dig == 0:    print(-1)    exit() for i in range(dig, 0, -1):    for j in range(9, 0, -1):        if v - a[j-1] >= mincost * (i-1):            print(j, end = "")            v -= a[j-1]            breakprint()