n,k=map(int,input().split())a=[]for _ in range(n):    s=input()    a.append(len(s))x=input()y=len(x)a.sort()i=a.index(y)j=a.count(y)p=iq=i+j-1print((p//k)*5 + p + 1,(q//k)*5 + q + 1)
