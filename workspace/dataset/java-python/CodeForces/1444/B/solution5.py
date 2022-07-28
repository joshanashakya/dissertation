n = int(input())
mod = 998244353
den = 1
arr = [int(x) for x in input().split()]
arr.sort() for i in range(1, n + 1):    den = den * (i + n) * pow(i, mod - 2, mod) % mod print(
    (sum(arr[n:2 * n]) - sum(arr[0:n])) * den % mod)
