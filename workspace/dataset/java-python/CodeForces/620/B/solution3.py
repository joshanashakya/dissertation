a,b=map(int,input().split())arr=[6,2,5,5,4,5,6,3,7,6]seg=0for i in range(a,b+1):    while(i>0):        x=int(i%10)        seg+=arr[x]        i=i//10print(seg)
