for t in range(int(input())):    n, m, x, y = map(int, input().split())    if y > 2 * x:        y = 2 * x    ans = 0    for i in range(n):        s = input().split('*')        for item in s:            r = len(item)            ans += y * (r // 2) + x * (r % 2)    print(ans)
