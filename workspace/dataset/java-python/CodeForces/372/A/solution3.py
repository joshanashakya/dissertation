import mathimport sys input = sys.stdin.readline n = int(input())a = [0] * nfor i in range(n):    a[i] = int(input())a.sort()p1 = 0p2 = n//2ans = nwhile p1 < n//2 and p2 < n:    if a[p2] >= 2*a[p1]:        p1 += 1        p2 += 1        ans -= 1    else:        p2 += 1print(ans)
