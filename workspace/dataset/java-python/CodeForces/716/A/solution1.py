n,c=map(int,input().split())l=list(map(int,input().split()))t=1p=l[0]for i in l[1:]:    if i-p>c:        t=1    else:        t+=1    p=iprint(t)
