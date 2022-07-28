n, k, t = map(int, input().split())
p = n * k * t // 100
arr = [0] * nfor
i in range(n):
if p > 0:        if
p % k == p: arr[i] += p else:            arr[i] += k
p = p - kfor
i in range(n): print(arr[i], end=" ")
