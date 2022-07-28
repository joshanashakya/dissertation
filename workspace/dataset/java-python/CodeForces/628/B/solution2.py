s=input()ans=0for i in range(len(s)):    if(i!=len(s)-1):        if(int(s[i]+s[i+1])%4==0):            ans+=i+1            #print(s[i]+s[i+1],i) ans+=s.count("4")+s.count("8")+s.count("0")print(ans)
