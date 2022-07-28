n=int(input())c=0cc=0l=list(map(int,input().split()))for i in range(n): if l[i]==i:  c+=1 elif i==l[l[i]]:  cc=1print(c+cc+int(c!=n))
