import sysinput=sys.stdin.readlinen=int(input())a=list(map(int,input().split()))dic1={}dic2={}dic1[0]=1ans=0curr=0for i in range(n):  curr=a[i]^curr  if i%2==0:    if curr in dic2:      ans+=dic2[curr]      dic2[curr]+=1    else:      dic2[curr]=1  else:    if curr in dic1:      ans+=dic1[curr]      dic1[curr]+=1    else:      dic1[curr]=1print(ans)
