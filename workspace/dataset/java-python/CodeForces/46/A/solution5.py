n = int(input())s = 1result = []t = 1for i in range(1, n):    t += s    if t > n:        t -= n    result.append(t)    s += 1print(*result)
