import mathimport sysn, k = map(int, input().split())a = [0] * nside = (n - k) // 2for i in range(side, n, side + 1):    a[i] = 1print(''.join(map(str, a)))
