n=int(input())s1=input()s2=input()t00,t10,t11,t01=0,0,0,0for i in range(n): if s1[i]=='0' and s1[i]==s2[i]:   t00+=1 elif s1[i]=='1' and s2[i]=='0':   t10+=1 elif s1[i]=='1' and s2[i]=='1':   t11+=1 elif s1[i]=='0' and s2[i]=='1':   t01+=1ans=t00*t10+t00*t11+t01*t10print(ans)