from collections import Countern,k=map(int,input().split())arr=list(map(int,input().split()))t=[arr[i]-k*i for i in range(n)]d=Counter(t)cnt=0for key,val in d.items():    if key<=0:        continue    if val>cnt:        cnt=val        best=keyprint(n-cnt) for i in range(n):    x=arr[i]-k*i-best    if x<0:        print("{} {} {}".format("+",i+1,-x))    if x>0:        print("{} {} {}".format("-",i+1,x))  