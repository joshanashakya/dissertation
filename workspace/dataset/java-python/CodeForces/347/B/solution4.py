n = int(input())a = list(map(int,input().split(' ')))c = 0   for i in range(n):    if i == a[i] :        c += 1    if c == n :    print(n)else:    for i in range(n):        if i != a[i] and a[a[i]] == i:            print(c+2)            break    else:        print(c+1)