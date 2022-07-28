d = []n,k=map(int,input().split())for _ in range(n):    p,t=map(int,input().split())    d.append((p,-t))d.sort(reverse=True)print(d.count(d[k-1]))
