n, d = map(int,input().split())a = list(map(int,input().split()))m = int(input())a.sort()k = 0s = 0for i in range(m):    if i < len(a):        k += a[s]        s += 1    else:        k -= dprint(k) 
