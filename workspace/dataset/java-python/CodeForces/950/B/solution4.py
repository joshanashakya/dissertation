# Codeforces Submission# User :    sudoSieg# Time :    14:40:09# Date :    21/10/2020 import ioimport osinput = io.BytesIO(os.read(0, os.fstat(0).st_size)).readlinen, m = map(int, input().split())a = [*map(int, input().split())]b = [*map(int, input().split())]j = 0f = 0i = 0si, sj = 0, 0while i < n or j < m:    if si > sj:        sj += b[j]        j += 1    elif si < sj:        si += a[i]        i += 1    elif si == sj and sj == 0:        sj += b[j]        j += 1    if si == sj != 0:        si = 0        sj = 0        f += 1    print(f)
