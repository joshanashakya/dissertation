n = int(input())m = 0while n > 0 :    d = n % 10    if d == 4 or d == 7 :        m += 1    n = n // 10if m == 4 or m == 7 :    print("YES")else :    print("NO")
