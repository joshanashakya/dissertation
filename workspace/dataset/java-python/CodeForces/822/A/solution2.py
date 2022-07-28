import mathn,m = map(int, input().split())fac1 = 1fac2 = 1i1 = 1i2 = 1while (i1<=n and i2<=m):  fac1 = fac1 * i1  fac2 = fac2 * i2  i1 = i1 + 1  i2 = i2 + 1 print(math.gcd(fac1, fac2))
