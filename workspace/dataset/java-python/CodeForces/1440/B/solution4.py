for _ in range(int(input())):    n, k = map(int, input().split())
daf = list(map(int, input().split()))
daf.sort()
has = 0
for i in range(k):        has += daf[-(i + 1) * ((n // 2) + 1)]
print(has)
