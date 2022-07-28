l=int(input())s=input()i=0ans=""while(l>0):    ch=s[i]    i+=1    if l%2==1:        ans+=ch    else:        ans=ch+ans    l-=1print(ans)
