k=int(input())ans=[int(1)]*10prod=int(1)s="codeforces"i=int(0)while k>prod:    ans[i]+=1    prod=prod*ans[i]//(ans[i]-1)    i+=1    i=i%10for i in range(10):    print(s[i]*ans[i],end="")
