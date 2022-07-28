arr = sorted(map(int, input().split()))a, b, c, d = arr if a+b > c or b+c > d:    print("TRIANGLE")elif  a+b == c or b+c ==d:    print("SEGMENT")else:    print("IMPOSSIBLE")
