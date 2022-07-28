n = int(input())q = max_q = t0 = 0for i in range(n):  t, c = map(int, input().split())  q = max(0, q - t + t0) + c  if q > max_q:    max_q = q  t0 = tprint(t0 + q, max_q)
