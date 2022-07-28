p1, p2, p3, p4, a, b = map(int, input().split()) m = min(p1, p2, p3, p4) if m - a <= 0:
    print(0)elif m > b:
    print(b - a + 1)else:
    print(m - a)
