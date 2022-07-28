n, m = map(int, input().split()) inters = n * m moves = inters // max(n, m) if moves % 2 == 0:    print('Malvika')else:    print('Akshat')
