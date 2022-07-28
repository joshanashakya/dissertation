n,k=map(int,input().split())a=[int(x) for x in input().split()]a.insert(0,0)a=sorted(list(set(a)))for i in range(min(k,len(a)-1)):	print(a[i+1]-a[i])for i in range(max(k-len(a)+1,0)):	print(0)
