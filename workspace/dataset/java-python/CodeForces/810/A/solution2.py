def grade(ar):    z=sum(ar)/len(ar)    f=int(z)    s=z-f    if(s>=0.5):        return f+1    else:        return f x,y=map(int, input('').split())ar=list(map(int, input('').split()))q=grade(ar)ct=0while(q<y):    ct=ct+1    ar.append(y)    q=grade(ar) print(ct) 
