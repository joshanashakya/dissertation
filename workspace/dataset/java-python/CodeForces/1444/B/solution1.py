n = int(input())
z = sorted(map(int, input().split()))
mod = 998244353
fact = [1] * (2 * n + 1)
for i in range(1, 2 * n + 1):    fact[i] = fact[i - 1] * i % modinv = [0] * (2 * n + 1)
inv[2 * n] = pow(fact[i], mod - 2, mod)
for i in range(2 * n - 1, -1, -1):    inv[i] = inv[i + 1] * (i + 1) % moddef
ncr(n, r):
return (fact[n] * inv[n - r] % mod * inv[r] % mod) % mod a, b = 0, 0
for i in range(n):    a += z[i]
for j in range(n, 2 * n):    b += z[j]
t = b - aprint((ncr(2 * n, n) * t) % mod)
