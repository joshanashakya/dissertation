for _ in range(int(input())):    n = int(input())    a = [int(x) for x in input().split()]    x = 0    add = 0    for i in range(1, n):        if a[i-1]>a[i]:            diff = a[i-1]-a[i]            while diff>add:                add += 2**x                x += 1            a[i] = a[i-1]    print(x)
