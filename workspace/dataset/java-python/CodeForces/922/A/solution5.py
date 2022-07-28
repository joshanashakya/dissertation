x,y = map(int,input().split())if (y==0) or (y==1 and x!=0):    print("No")else:    if (x-(y-1))%2==0 and x>=(y-1) and y!=0:        print("Yes")    else:        print("No")
