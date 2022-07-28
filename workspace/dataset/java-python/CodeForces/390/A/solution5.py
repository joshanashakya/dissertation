a= int(input())b=[]c=[]for i in range(a):    x,y = map(int,input().split())    b.append(x)    c.append(y)print(min(len(set(b)),len(set(c))))
