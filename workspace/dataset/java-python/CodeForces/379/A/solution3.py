a1,b1=input().split(' ')a=int(a1)b=int(b1) count=awhile(a>=b):    d=a//b    count+=d    m=a%b    a=d+m    print(count)    
