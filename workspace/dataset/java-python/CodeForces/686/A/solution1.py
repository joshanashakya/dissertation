n,x=map(int,input().split())a=0 for i in range(n):    q,w=input().split()    w=int(w)    if(q=='+'):        x+=w    else:        if(x>=w):            x-=w        else:            a+=1 print(x,a)
