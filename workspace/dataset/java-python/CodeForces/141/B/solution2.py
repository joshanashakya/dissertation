a,x,y=map(int,input().split())if y<=0 or abs(x)>=a:    print(-1)else:    v=y//a    v1=y/a    if v==v1:        print(-1)    elif v==0:        print(1 if abs(x)<a/2 else -1)    elif v%2:        u=v//2*3+1        print(u+1 if abs(x)<a/2 else -1)    else:        u=(v-1)//2*3        if x<0:            print(u+3)        elif x>0:            print(u+4)        else:            print(-1)