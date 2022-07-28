n=int(input())l=list(map(int,input().split()))cnt=[0]*(10**6+100)for i in l:  cnt[i]+=1s=0ans=0for i in cnt: s+=i ans+=s%2 s//=2print(ans)
