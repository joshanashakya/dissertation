t, s, x = map(int, input().split())if x>=t:    x -= t    sss = x//s    x = x%s    if x == 0 or (sss != 0 and x == 1):        print('YES')    else:        print('NO')else:    print('NO')    
