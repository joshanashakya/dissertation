n=map(int,input().split())ar=list(map(int,input().split()))cnt=dict()for i in range(-20,20):    cnt[i]=ar.count(i)ans=0for i in range(1,11):    ans+=cnt[i]*cnt[-i]ans+=cnt[0]*(cnt[0]-1)//2print(ans)
