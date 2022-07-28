s=input()n=len(s)ans=0for i in range(1,n):  if int(s[i-1:i+1])%4==0:    ans+=ifor i in range(n):  if int(s[i])%4==0:    ans+=1print(ans)
