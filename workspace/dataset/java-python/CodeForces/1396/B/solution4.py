t = int(input())
for _ in range(t):
    n = int(input())
    a = sorted([int(x) for x in input().split()])
    s1 = sum(a[0:n - 1])
    s2 = a[n - 1]
    if s2 > s1:
        print("T")
    elif sum(a) % 2:
        print("T")
    else:
        print("HL")
