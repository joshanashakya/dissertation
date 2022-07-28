t = int(input())
for _ in range(t):    n, k = [int(s) for s in input().split(" ")]
a = [int(s) for s in input().split(" ")]
mx = max(a)
if mx * n < k:
    ans = -1    else:
    ans = n + 1
for i in range(k):            pos = -2
for i in range(n - 1):                if
a[i] < a[i + 1]: pos = i
break
ans = pos + 1
if pos == -2:                break
a[pos] += 1
print(ans)
