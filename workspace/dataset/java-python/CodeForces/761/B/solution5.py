n, l = [int(x) for x in input().split(' ')]k = [int(x) for x in input().split(' ')]s = [int(x) for x in input().split(' ')] kd = [(k[i%n] - k[i-1])%l for i in range(1, n+1)]sd = [(s[i%n] - s[i-1])%l for i in range(1, n+1)] ans = Falsefor i in range(n):    if kd == sd[i:] + sd[:i]:        ans = True        breakif ans:    print('YES')else:    print('NO')
