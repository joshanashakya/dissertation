k=int(input())ans=[-1]while sum(ans)-len(ans)+1!=k:	ans.append(min(10**6,k+len(ans)-sum(ans)))print(len(ans))print(*ans)
