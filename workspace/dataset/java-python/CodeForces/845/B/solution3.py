import sysfrom itertools import product n = list(map(int, input())) ans = 6for a in product(range(10), repeat=6):    if a[0]+a[1]+a[2] == a[3]+a[4]+a[5]:        x = sum(0 if n[i] == a[i] else 1 for i in range(6))        ans = min(ans, x) print(ans)