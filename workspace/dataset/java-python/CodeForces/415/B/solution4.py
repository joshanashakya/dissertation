import mathn,a,b=map(int,input().split())l=list(map(int,input().split()))for e in l:        z=(e*a)//b        s=e-math.ceil(z*b/a)        print(s,end=" ")print()
