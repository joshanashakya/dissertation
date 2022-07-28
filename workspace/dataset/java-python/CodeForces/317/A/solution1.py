x,y,m=map(int,input().split())x,y=min(x,y),max(x,y)if y>=m:s=0elif x+y<=x:s=-1else:    s=(y-x+y-1)//y    x+=y*s    while max(x,y)<m:        if x<y:x+=y        else:y+=x        s+=1print(s)
