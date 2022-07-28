n = int(input())f = False for i in range(32):    if i*(i+1)/2 == n:        f = True        break        print('YES' if f else 'NO')
