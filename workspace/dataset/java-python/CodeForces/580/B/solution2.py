n, d = map(int, input().split())m = []f = []for _ in range(n):    mm, ff = map(int, input().split())    m.append(mm)    f.append(ff)z = sorted(zip(m, f))i, j, maxi, cnt = 0, 0, 0, 0while j<n:    if z[j][0]-z[i][0]<d:        cnt += z[j][1]        maxi = max(maxi, cnt)        j += 1    else:        cnt -= z[i][1]        i += 1print(maxi)
