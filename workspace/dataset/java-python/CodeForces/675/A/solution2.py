a, b, c = map(int, input().split()) if a == b: print('YES')elif c == 0 or b > a and c < 0 or b < a and c > 0: print('NO')else:    c = abs(c)     if (b-a) % c == 0: print('YES')    else: print('NO')
