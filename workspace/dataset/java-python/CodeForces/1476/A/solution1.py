t = int(input())
for i in range(t):    n, k = map(int, (input().split()))
if n > k:        if
n % k == 0: print(1) else:            print(2) elif k % n == 0: print(k // n) else:        print(k // n + 1)
