a = input()b = input() f = True for i,j in zip(a , b):    if j>i:        f = False        break if f:    print(b) else:    print(-1)
