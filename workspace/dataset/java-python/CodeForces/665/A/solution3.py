import sys a, ta = map(int, input().split())b, tb = map(int, input().split())h, m = map(int, input().split(':'))s, t = h*60 + m, min(h*60 + m + ta, 24*60)ans = 0 for x in range(5*60, 24*60, b):    if s < x + tb and t > x:        ans += 1 print(ans)