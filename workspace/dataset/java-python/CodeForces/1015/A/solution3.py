n,m= map(int,input().split())li =[]s =[]for i in range(n):    a,b = map(int,input().split())    for i in range(a-1,b):        li.append((i+1))for i in range(m):    if i+1 not in list(set(li)):        s.append(i+1)if len(s)>0:    print(len(s))    print(*s)else:    print(0)