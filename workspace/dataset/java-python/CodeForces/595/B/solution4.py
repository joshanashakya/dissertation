from math import * MOD = 1000000007 n, k = map(int, input().split()) a = [int(i) for i in input().split()]b = [int(i) for i in input().split()] res = 1for i in range(n // k):    cont = ceil(10**k / a[i]) - ceil((b[i] + 1) * 10**(k-1) / a[i]) + ceil(b[i] * 10**(k-1) / a[i])    # print(cont)    res = (res * cont) % MOD print(res)