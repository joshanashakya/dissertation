import sysfrom collections import Countern,m=map(int,input().split())l1=[];l2=[];for i in range(n) :    l1.append(input())for i in range(m) :    l2.append(input())c1=Counter(l1)c2=Counter(l2)c=0;s=0;c3=c1&c2#print(c1,"\n",c2,"\n",c3)l=sum(c3.values())#print(l)c1=c1-c3c2=c2-c3c4={};c5={}for i,j in c1.items() :    c4[i.split()[1]]=c4.get(i.split()[1],0)+jfor i,j in c2.items() :    c5[i.split()[1]]=c5.get(i.split()[1],0)+jc4=Counter(c4)c5=Counter(c5)#print(c4)#print(c5)c6=c4&c5#print(c6)l1=sum(c6.values())#print(l1)print(l+l1,l)