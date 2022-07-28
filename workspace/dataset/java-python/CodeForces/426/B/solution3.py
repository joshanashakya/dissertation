n,m=map(int,input().split())l=[]for i in range(n):l.append(list(map(str,input().split())))while not n%2 and l[:n//2]==l[n//2:n][::-1]:n//=2print(n)
