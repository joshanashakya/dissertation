n,m = map(int,input().split())cnt = 0while m>n:    if m%2:        m = m//2+1        cnt += 2    else:        m //= 2        cnt += 1print(n-m+cnt)
