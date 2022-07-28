n, m, k, l = map(int, input().split()) if m > n:    print(-1)    exit() x = (k+l+m-1)//mif m*x > n:    print(-1)else:    print(x)
