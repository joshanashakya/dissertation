from sys import stdinimport mathn, k = map(int, stdin.readline().rstrip().split(" "))  a = [[] for i in range(n+1)]act = {}active = [0]*(n+1)  for i in range(2,n+1):    if not a[i]:        act[i]=0        for j in range(i,n+1,i):            a[j].append(i) storing = {}for _ in range(k):    s, v = stdin.readline().rstrip().split(" ")    v = int(v)    if s=="-":        if active[v]==1:            print("Success")            active[v]=0            for i in list(a[v]):                act[i]=0        else:            print("Already off")    else:        if active[v]:            print("Already on")        else:            test = 1            r = True            for i in list(a[v]):                if act[i]:                    test = i                    r=False                    break            if r:                print("Success")                active[v]=1                for i in list(a[v])[::-1]:                    act[i] = v            else:                x = 0                print("Conflict with", act[test])
