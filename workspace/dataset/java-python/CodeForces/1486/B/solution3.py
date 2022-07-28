def solve(z):
    return z[n // 2] + 1 - z[(n - 1) // 2]


for _ in range(int(input())):
    n = int(input())
    x, y = map(sorted, zip(*(map(int, input().split()) for _ in range(n))))
    print(solve(x) * solve(y))
