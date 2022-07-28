l, r = [int(j) for j in input().split()]count = 0for j in range(32):    for k in range(32):        res = (2 ** j) * (3 ** k)        if res >= l and res <= r:            count += 1print(count)
