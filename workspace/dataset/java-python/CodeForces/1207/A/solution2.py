R=lambda:map(int,input().split())n,=R()for _ in[0]*n:b,*a=R();(h,p),(c,f)=sorted(zip(R(),a));m=min(b//2,f);print(m*c+min(p,b//2-m)*h)
