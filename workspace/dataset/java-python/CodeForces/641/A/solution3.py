n = int(input())s = input()d = {}a = list(map(int,input().split()))for i in range(n):    d[i+1] = 1*a[i] if s[i]=='>' else -1*a[i]cell = 1for i in range(n):    cell+= (d[cell])    if cell<1 or cell>n:        print("FINITE")        breakelse:    print("INFINITE")
