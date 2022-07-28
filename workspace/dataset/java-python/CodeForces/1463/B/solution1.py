import bisectimport

sysinput = sys.stdin.readline t = int(input())
pow2 = [1]
for _ in range(32):    pow2.append(2 * pow2[-1])
for _ in range(t):    n = int(input())
a = list(map(int, input().split()))
b = []
for i in a:        j = bisect.bisect_left(pow2, i + 0.5) - 1
if i - pow2[j] <= pow2[j + 1] - i or j >= 29:
    b.append(pow2[j])        else:
    b.append(pow2[j + 1])
print(*b)
