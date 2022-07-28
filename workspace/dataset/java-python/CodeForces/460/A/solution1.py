n, m = map(int, input().split()) answer = n + n // (m - 1) if n % (m - 1) == 0:    answer -= 1 print(answer)
