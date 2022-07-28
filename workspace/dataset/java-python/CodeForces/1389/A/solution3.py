t = int(input())
for _ in range(t):
    l, r = map(int, input().split())
    if (r < 2 * l):
        print("-1 -1")
    else:
        print(l, 2 * l)
