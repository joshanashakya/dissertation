import collectionss=input()k=int(input()) d=dict()for i in s: if i in d:d[i]+=1 else:d[i]=1d=sorted(d.items(), key=lambda x: x[1])A=set()ans=0#print(d)for i  in d: if k-i[1]>=0:   A.add(i[0])   k-=i[1]   ans+=1print(len(d)-ans)for i in s: if i not in A:   print(i,end="")    