n,m=map(int,input().split())l=[]for i in range(n):l.append("".join(list(map(str,input().split()))))while not n%2:    if l[:n//2]!=l[n//2:n][::-1]:break    n//=2print(n)
