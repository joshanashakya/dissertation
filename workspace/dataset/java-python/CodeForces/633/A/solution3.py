a,b,c=map(int,input().split())ans="No"for i in range(c//a+1):    if (c-a*i)%b==0:        ans="Yes"        breakprint(ans)
