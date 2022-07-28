s = int(input())f = 0i = 0while s >= 36:    s -= 36    f += 1while s >= 3:    s -= 3    i += 1if s == 2:    i += 1 while i >= 12:    f += 1    i -= 12  print(f, end= ' ')print(i)
