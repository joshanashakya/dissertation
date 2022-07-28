for iii in range(int(input())):    a,b=map(int,input().split())    if(a>b):        a,b=b,a     if(a+b)%3==0 and 2*a>=b:        print("yes")    else:        print("no")
