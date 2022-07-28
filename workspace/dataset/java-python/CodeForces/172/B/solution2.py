a,b,m,r0=map(int,input().split())dct={}i=0while(True):    r0=(a*r0+b)%m    i+=1    if(r0 not in dct.keys()):        dct[r0]=i    else:        print(i-dct[r0])        break 
