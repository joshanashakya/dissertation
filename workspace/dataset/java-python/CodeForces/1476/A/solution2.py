t = int(input())
for i in range(t):    n, k = map(int, (input().split()))
cf = (n + k - 1) // k
k *= cf
print((k + n - 1) // n)
