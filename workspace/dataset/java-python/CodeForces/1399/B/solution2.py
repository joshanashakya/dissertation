for t in range(int(input())):
    n = int(input())
    a = [int(i) for i in input().split()]
    x = min(a)
    b = [int(i) for i in input().split()]
    y = min(b)
    sm = 0
    for i in range(n):
        sm += max(a[i] - x, b[i] - y)
    print(sm)
