n, m = map(float, input().split())dni = 0cnt = 0while n > 0:    n = n - 1    dni = dni + 1    cnt = cnt + 1    if cnt == m:        n = n + 1        cnt = 0print(dni)
