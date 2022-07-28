num, t  = map(int, (input().split()))arr = list(map(int, input().split())) ct = 0i = 0while t > 0:    t -= (86400 - arr[i])    i += 1    ct += 1 print(ct)
