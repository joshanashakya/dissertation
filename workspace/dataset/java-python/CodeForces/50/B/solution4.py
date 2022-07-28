n=input()m=list(str(n))a=[]for x in set(m):    a.append(m.count(x))b=0for y in range(len(a)):    b+=(a[y])**2print(b)
