n = int(input())points = [[-1, -1, -1, -1, -1]]for _ in range(n):    pts = list(map(int, input().split()))    points.append(pts) def check(i, j, k):    res = 0    for t in range(5):        a = points[j][t] - points[i][t]        b = points[k][t] - points[i][t]        res += a * b    return res > 0 res = []for i in range(1, n+1):    valid = True    for j in range(1, n+1):        if j != i and valid:            for k in range(1, n+1):                if j != k:                    if check(i, j, k):                        valid = False                        break            if not valid:                break    if valid:        res.append(i)print(len(res))print(*res)
