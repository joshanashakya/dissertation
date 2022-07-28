n, k, t = map(int, input().split())
ans = [0] * ni = 0 a = n * k * t // 100 while a > 0:    if
a >= k: ans[i] += k
i += 1
a -= k else:        ans[i] += int(a)
a -= int(a)
print(*ans)
