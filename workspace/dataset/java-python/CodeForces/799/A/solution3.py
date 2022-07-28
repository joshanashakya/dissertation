from math import ceil n, t, k, d = map(int, input().split())time_o = ceil(n / k) * t        if d + t >= time_o:           print('NO')else:    print('YES')
