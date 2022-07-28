for i in range(0, int(input())):    n, k = list(map(int, input().split()))
c = n // k
if n % k != 0:        c += 1
s = k * c
if s % n == 0:
    print(s // n)    else:
    print(s // n + 1)
