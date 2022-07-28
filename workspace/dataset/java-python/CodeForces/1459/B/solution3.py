n = int(input())
res = 0
if n % 2:
    res = (2 + n // 2) * (n + 1)else:
    res = (1 + n // 2) ** 2
print(res)
