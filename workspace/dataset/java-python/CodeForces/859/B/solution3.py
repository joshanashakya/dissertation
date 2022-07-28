n=int(input())x=1while x**2<n:    x+=1if x**2>n:    x-=1t=n-x**2ans=4*xif(t!=0):    b=t//x    z=t%x    ans+=(2*b)    if z>0:        ans+=2print(ans)
