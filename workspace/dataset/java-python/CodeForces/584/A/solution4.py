x,y=map(int,input().split())if y<10:    for i in range(x):        print(y,end="")else:    if x==1:        print(-1)    else:        s=10**(x-1)        print(s)
