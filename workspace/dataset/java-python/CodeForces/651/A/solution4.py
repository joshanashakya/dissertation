a,b=map(int,input().split())ans=0if a<2 and b<2:    print(0)    exit()while a>0 and b>0:    ans+=1    if a<b:        a+=1        b-=2    else:        a-=2        b+=1print(ans)
