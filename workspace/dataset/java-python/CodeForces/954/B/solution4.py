n = int(input())s = input() best = nfor i in range(2, n // 2 + 1):    if s[:i] == s[i:2*i]:        cur = i + 1 + n - 2 * i        best = min(best, cur)print(best)
