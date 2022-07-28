n, q, k = map(int, input().split());
a = list(map(int, input().split()))
for Q in range(q): l, r = map(int, input().split());print(a[r - 1] - a[l - 1] + (l - r) * 2 + k - 1)
