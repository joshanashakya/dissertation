n = int(input())x, y = [], []for j in range(n):    xj, yj = [int(j) for j in input().split()]    x.append(xj)    y.append(yj)x_min = x[0]y_min = y[0]x_max = x[0]y_max = y[0]for j in range(1, n):    x_min = min(x_min, x[j])    y_min = min(y_min, y[j])    x_max = max(x_max, x[j])    y_max = max(y_max, y[j])l = x_max - x_minr = y_max - y_minprint(max(l, r) ** 2)
