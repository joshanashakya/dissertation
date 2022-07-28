for __ in range(int(input())):    n, x = map(int, input().split())
if n == 1 or n == 2:
    print(1)    else:
    if
(n - 2) % x == 0: print(1 + (n - 2) // x) else:            print(2 + (n - 2) // x)
