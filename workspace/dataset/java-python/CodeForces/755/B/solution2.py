n, m = map(int, input().split())a = {input() for x in range(n)}b = {input()for y in range(m)}t = n+m-len(a | b)print('YES'if n+t % 2 > m else 'NO')
