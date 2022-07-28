l=list(map(int,input().split()))x,y,z,k=(l[0]+l[1])*2,(l[1]+l[2])*2,(l[0]+l[2])*2,l[0]+l[1]+l[2]print(min(min(x,k),min(y,z)))
