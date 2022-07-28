def f(n, i):
    c = 0
    while n:
        c += 1
        n //= i
    return c


for _ in range(int(input())):
    a, b = map(int, input().split())
    ops = 0 if b > 1 else 1
    print(min([i + f(a, b + i) for i in range(ops, 20)]))
