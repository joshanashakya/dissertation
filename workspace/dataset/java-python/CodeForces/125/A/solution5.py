n = int(input())a = n//36rema = n%36if(rema==35):    a+=1if(a>=n):    b=0else:    b = (n-a*36)//3    rem = (n-a*36)%3    if(rem==2):        b+=1print(a,b)
