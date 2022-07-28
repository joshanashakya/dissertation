import sysinput = sys.stdin.readline for test in range(int(input())):    n = int(input())
a = [int(i) for i in input().split()]
ones = [i for i, j in enumerate(a) if j == 1]
low = min(ones)
high = max(ones)
ans = 0
for i in range(low, high + 1):        if
a[i] == 0: ans += 1
print(ans)
