c1,c2,x,y=map(int,input().split())l=c1+c2temp=lh=pow(10,10)while(l<h):    ans=(l+h)//2    if (c1>ans - ans//x) or (c2>ans- ans//y) or (temp>ans - ans//(x*y)):        l=ans+1    else:        h=ansprint(l)