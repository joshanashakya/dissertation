# https://codeforces.com/problemset/problem/387/A  def I(): return map(int, input().split(':'))  h, m = I()dh, dm = I()h, m = h - dh, m - dmh, m = (h + m // 60) % 24, m % 60 print(f'{h:02}:{m:02}')
