n,k=map(int,input().split())c=k+1 if n%(2*k+1)>=k+1 or n%(2*k+1)==0 else 1ans=[]while c<=n:  ans.append(c)  c+=2*k+1if ans[-1]+k<n:  ans.append(min(n,ans[-1]+k*2+1))print(len(ans))print(*ans)
