import math n=int(input())l=list(map(int,input().split()))mx=-10000000for num in l:    if(num<0):        mx=max(mx,num)    else:        k=int(math.sqrt(num))        if(k*k<num):            mx=max(mx,num)print(mx)
