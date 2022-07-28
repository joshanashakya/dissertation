t = int(input())
inv = [0] * (2 * 10 ** 5 + 5)
check = [True] * (2 * 10 ** 5 + 5)
for _ in range(t):    n, k = map(int, input().split())
p = list(map(int, input().split()))
b = list(map(int, input().split()))
for i in range(n):        check[i] = True
inv[i + 1] = 0
for idx, val in enumerate(p):        inv[val] = idx
for val in b:        check[inv[val]] = False
ans = 1
mod = 998244353
for val in b:        curr = inv[val]
pos = 0
if curr + 1 < n and check[curr + 1]:            pos += 1
if curr - 1 >= 0 and check[curr - 1]:            pos += 1
ans = (ans * pos) % mod
check[curr] = True
print(ans)
