n, m = map(int, input().split())
i = 0
while m > i: m, i = m - i - 1, (i + 1) % n
print(m)
