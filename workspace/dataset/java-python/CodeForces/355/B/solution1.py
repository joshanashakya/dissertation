c1,c2,c3,c4=map(int,input().split())n,m=map(int,input().split())a=list(map(int,input().split()))b=list(map(int,input().split()))ans=0for i in range(0,len(a)):    ans+=min(c2,a[i]*c1)ans=min(ans,c3)ans1=0for i in range(0,len(b)):    ans1+=min(c2,b[i]*c1)ans1=min(c3,ans1)print(min(c4,ans1+ans))
