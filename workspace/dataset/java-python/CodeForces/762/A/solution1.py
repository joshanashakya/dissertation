n, k = map(int, input().split())  def printDivisors(n):    l = []    i = 1    while (i * i < n):        if (n % i == 0):            l.append(i)            if (len(l) >= k):                break        i += 1     for i in range(int(n ** 0.5), 0, -1):        if (n % i == 0):            l.append(n // i)            if (len(l) >= k):                break    return l  res = printDivisors(n)if len(res) >= k:    print(res[k - 1])else:    print(-1)