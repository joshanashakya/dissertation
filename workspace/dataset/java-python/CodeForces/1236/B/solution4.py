n, m = map(int, input().split())mod = 10**9+7print(pow((pow(2,m,mod)+mod-1)%mod, n, 10**9+7))
