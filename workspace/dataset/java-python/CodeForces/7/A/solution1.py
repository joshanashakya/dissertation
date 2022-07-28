a=['']*8for i in range(8):    a[i]=input()a=list(map(lambda a: a.count('B'),a))b=set(a)c=0for i in b:    if i==8:        c+=a.count(8)    else:        c+=iprint(c)
