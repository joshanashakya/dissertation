n,k,q = map(int, input().strip().split(' '))lst = list(map(int, input().strip().split(' ')))p=[]c=0for i in range(q):    t,d = map(int, input().strip().split(' '))    if t==1:                if c<k:            p.append(lst[d-1])            c+=1        else:            ind=p.index(min(p))            if lst[d-1]>min(p):                del p[ind]                p.append(lst[d-1])    else:        if lst[d-1] in p:            print('YES')        else:            print('NO')                                    
