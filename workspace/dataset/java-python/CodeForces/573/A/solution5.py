from math import  gcdn=int(input());arr=list(map(int,input().split()))s=set()for i in arr:  while i%2==0:    i=i//2  while i%3==0:   i=i//3  s.add(i)if len(s)!=1:print("NO")else:print("YES")
