x, y, z, t1, t2, t3 = map(int, input().split())ele = (abs(z - x) * t2) + (abs(x - y) * t2) + (3 * t3)sta = abs(x - y) * t1 if ele <= sta:    print('YES')else:    print('NO')
