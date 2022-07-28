import sysinput = sys.stdin.readlinetestcase = int(input())
mod = 998244353
for _ in range(testcase):  n, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
dca = {a[i] - 1: i for i in range(n)}
dcb = {b[i] - 1: i for i in range(k)}
ls = [1 for i in range(n)]
for i in range(k):    ls[dca[b[i] - 1]] = 0
ans = 1
for i in range(k):    tmp = 0
ind = dca[b[i] - 1]
if ind > 0:      tmp += ls[ind - 1]
if ind < n - 1:      tmp += ls[ind + 1]
ans *= tmp
ans %= mod
ls[ind] = 1
print(ans)
