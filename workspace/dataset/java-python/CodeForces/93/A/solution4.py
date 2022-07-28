n, m, a, b = map(int, input().split())

r1, r2, c1, c2 = (a - 1) // m, (b - 1) // m, (a - 1) % m, m - 1 if b == n else (b - 1) % m

if r1 == r2 or c1 == 0 and c2 == m - 1:

    print(1)

elif r2 == r1 + 1 or c1 == 0 or c2 == m - 1 or c1 == c2 + 1:

    print(2)

else:

    print(3)
