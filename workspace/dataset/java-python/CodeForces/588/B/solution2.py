n = int(input()) i = 2while i*i <= n:    while n % (i*i) == 0:        n /= i    i += 1 print(int(n))
