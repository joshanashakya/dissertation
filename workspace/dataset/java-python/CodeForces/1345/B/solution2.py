tests = []maxh = 0for t in range(int(input())):    n = int(input())    if n > maxh:        maxh = n    tests.append(n)cards = 2h = [2]x = 0while cards <= maxh:    x += 1    cards += 3 * x + 2    h.append(cards)for t in tests:    ans = 0    while t >= h[0]:        for b in h[::-1]:            if b <= t:               ans += 1               t -= b               break    print(ans)
