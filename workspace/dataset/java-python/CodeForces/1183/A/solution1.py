n=int(input())s=str(n)sum=1 while(sum%4!=0):    s=str(n)    sum=0    for i in s:        sum+=int(i)    n+=1 print(n-1)
