cases = int(input())

while cases:
    cases -= 1
    n = int(input())

    print(*list(range(n, 0, -1)))
