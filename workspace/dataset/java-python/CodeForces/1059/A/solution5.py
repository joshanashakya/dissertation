n,l,a=map(int,input().split())current=0ans=0for i in range(n):    x,y=map(int,input().split())    ans+=(x-current)//a    current=x+yans+=(l-current)//aprint(ans)
