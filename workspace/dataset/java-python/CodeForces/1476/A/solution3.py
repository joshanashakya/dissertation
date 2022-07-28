for _ in range(int(input())):     n, k = map(int, input().split())
if k % n == 0:
    print(k // n)     else:
    if
k > n: print(k // n + 1) else:               t = n // k
if n % k != 0:                    t = t + 1
if (t * k) % n == 0:
    print((t * k) // n)               else:
    print((t * k) // n + 1)
