n, m = map(int, input().split())points = 0if n < m:    points = nelse:    points = mif (points % 2) != 0:    print("Akshat")else:    print("Malvika")
