import math n,a,b=map(int,input().split(' '))rounds=math.log(n,2)r=int(rounds)for i in range(1,int(rounds)+1):    a=math.ceil(a/2)    b=math.ceil(b/2)    if(a==b):        if(i==r):            print('Final!')            break        else:            print(i)            break