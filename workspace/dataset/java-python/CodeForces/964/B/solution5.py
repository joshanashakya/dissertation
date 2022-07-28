n, A, B, C, T = map(int, input().split())t = list(map(int, input().split()))if (B >= C):  print(A * n)else:  ans = 0  for c in t:    ans += (T - c) * (C - B)  ans += n * A  print(ans)
