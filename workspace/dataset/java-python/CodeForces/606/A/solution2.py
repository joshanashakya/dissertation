import sysimport mathinput=sys.stdin.readlinea,b,c=(int(i) for i in input().split())x,y,z=(int(i) for i in input().split())req=0hv=0if(a<x):    req+=(x-a)else:    hv+=(a-x)//2if(b<y):    req+=(y-b)else:    hv+=(b-y)//2if(c<z):    req+=(z-c)else:    hv+=(c-z)//2if(hv>=req):    print("Yes")else:    print("No")