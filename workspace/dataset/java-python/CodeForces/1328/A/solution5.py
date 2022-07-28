n=int(input());for i in range(0,n):    r,s=input().split();    r=int(r);s=int(s);    if(r%s==0):        print("0");    else:        print(s-(r%s));        
