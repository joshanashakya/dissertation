n=int(input())s1=[]s2=[]ans=0for i in range(n):    a,b=input().split()    s1.append(a)    s2.append(b) for x in s2:    ans=ans+s1.count(x)    #print(ans)print(ans)        
