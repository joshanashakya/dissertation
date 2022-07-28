n, t, k, d = map(int, input().split()) c = 0 while c <= d:     n -= k    c += t if n > 0:    print("YES")else:    print("NO") 
