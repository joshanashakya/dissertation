from sys import stdin n, m, k = [int(x) for x in stdin.readline().split()] d = [int(x) for x in
                                                                                stdin.readline().split()]
splitD = [x for x in d[::2]] if n == 1:  print(min(d[0], k * m))  elif n == 2: print(0) elif d[0] == 0 or d[
    -1] == 0: print(0) elif n % 2 == 0: print(0) else:  if m >= n // 2 + 1:    times = m // (n // 2 + 1)
print(min(times * k, min(splitD))) else:    print(0)
