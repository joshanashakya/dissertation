for _ in range(int(input())):    a, b, x, y, n = map(int, input().split())
z = max((a - n), x)
t = max((b - (n - a + z)), y)
l = max((b - n), y)
q = max(a - (n - b + l), x)
print(min(z * t, l * q))
