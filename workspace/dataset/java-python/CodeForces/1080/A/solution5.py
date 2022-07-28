n,k=map(int,input().split())r=n*2ans=0if r%k==0:    ans+=r//kelse:    ans+=r//k+1r=n*5 if r%k==0:    ans+=r//kelse:    ans+=r//k+1r=n*8 if r%k==0:    ans+=r//kelse:    ans+=r//k+1print(ans)
