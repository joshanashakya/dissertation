o = ['0','4','6','9','a','d']oo = ['8','b']cnt = 0n = list(hex(int(input())))x = ''for i in range(2,len(n)):    x += n[i]x = str(x)for j in x:    if j in o:        cnt += 1    elif j in oo:        cnt += 2print(cnt)
