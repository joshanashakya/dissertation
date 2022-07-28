a,x,y,p,q=map(int,input().split())d=((x-p)**2+(y-q)**2)**0.5ans=d//(2*a)if(d%(2*a)!=0): ans+=1print(int(ans))        
