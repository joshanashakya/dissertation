n, m = map(int, input().split())a = []for i in range(n):    a.append(list(input()))k = 0min_r = n - 1max_r = 0min_c = m - 1max_c = 0for i in range(n):    for j in range(m):        if a[i][j] == 'X':            k += 1            min_r = min(min_r, i)            max_r = max(max_r, i)            min_c = min(min_c, j)            max_c = max(max_c, j)if (max_r - min_r + 1) * (max_c - min_c + 1) == k:    print("YES")else:    print("NO")