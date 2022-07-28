n, m = map(int, input().split())mexi = 1e9for i in range(m):    r, l = map(int, input().split())    mexi = min(mexi, l - r + 1)print(mexi)d = [str(j % mexi) for j in range(n)]print(' '.join(d))
