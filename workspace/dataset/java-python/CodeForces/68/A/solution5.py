*P, a, b = map(int, input().split())
print(max(0, min(b - a + 1, min(P) - a)))
