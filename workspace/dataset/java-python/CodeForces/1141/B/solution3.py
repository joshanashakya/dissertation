n=int(input())a=list(input().split())b=a*2bb=''.join(b)c=bb.split('0')ans=0for i in c:    ans=max(ans,len(i))print(ans)
