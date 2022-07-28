n, k, t = map(int, input().split())      if t < k:    print(t)elif t > n:    # as t<= n+k    standing = n - (t - k)    print(standing)else:    print(k)
