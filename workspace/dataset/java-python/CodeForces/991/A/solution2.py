A, B, C, N = map(int, input().split())ans = N - (A + B - C)if A < C or B < C or A > N or B > N or C > N or ans < 1:  print(-1)else:  print(ans)
