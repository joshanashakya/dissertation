# https://codeforces.com/problemset/problem/814/A# 900 la, lb = map(int, input().split())a = list(map(int, input().split()))b = list(map(int, input().split())) b.sort(reverse=True) o = "NO"z = 0for i in range(la):    n = a[i]    if n == 0:        a[i] = b[z]        z += 1 for i in range(la):    if i == la-1:        break     n = a[i]    n1 = a[i+1]     if n > n1:        o = "YES"        break         print(o)
