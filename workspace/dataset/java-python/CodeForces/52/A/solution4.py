from collections import Counterl=[]n=int(input())c=Counter(list(map(int,input().split())))for key,value in c.items():l.append(value)if len(l)==1:print(0)elif len(l)==2:print(min(l[0],l[1]))else:print(min(l[0]+l[1],l[0]+l[2],l[1]+l[2]))      