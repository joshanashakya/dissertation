n, m, k = map(int, input().split())a = sorted(list(map(int, input().split())))ans = m // (k + 1) * (a[-1] * k + a[-2]) + m % (k + 1) * a[-1]print(ans)
