try:    n,k=map(int,input().split())    j=[]    for i in range(n):        f=[]        p,t=map(int,input().split())        f.append(p)        f.append(t)        j.append(f)    final = sorted(j, key=lambda x: (x[0],-x[1]),reverse=True)            print(final.count(final[k-1]))except:    pass
