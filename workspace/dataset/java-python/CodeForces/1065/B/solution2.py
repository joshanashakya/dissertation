n,m = map(int,input().split())if m == 0:    ans1 = ans2 = nelse:    ans1 = max(0,(n-2*m))    i = 1    while m > 0:        m -= i        i+=1    ans2 = n-iprint(ans1,ans2)
