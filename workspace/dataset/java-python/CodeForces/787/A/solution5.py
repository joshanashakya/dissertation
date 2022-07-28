a,b=map(int,input().split())c,d=map(int,input().split())s=set()for i in range(101):  s.add(b+a*i)for i in range(101): if d+(c*i) in s:print(d+(c*i));exit()print(-1)
