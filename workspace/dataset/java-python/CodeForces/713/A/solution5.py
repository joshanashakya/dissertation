t = int(input())d = [0]*262143convert = str.maketrans('0123456789', '0101010101')for _ in range(t):    c, a = input().split()    if c=='?':        print(d[int(a,2)])    else:        d[int(a.translate(convert),2)] += 1 if c=='+' else -1