n, m, a, b = map(int, input().split())ans = min(n % m * b, (m - n % m ) * a)print(ans)
