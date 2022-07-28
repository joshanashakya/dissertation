n = int(input())a, b, c = map(int, input().split())s = a+b+cif(s == 0):    print(0, 0, 0)else:    print(n * a / s, n * b / s, n * c / s) 
