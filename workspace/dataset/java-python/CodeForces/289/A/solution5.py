n , k = map(int, input().split())ans = 0for i in range(n):    l, r = map(int, input().split())    ans += r-l + 1if ans % k == 0:    print(0)else: print(k - ans%k)
