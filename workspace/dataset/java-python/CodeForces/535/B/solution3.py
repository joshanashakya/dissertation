s = input()ans = 0n  =len(s)for i in range (1,n) :    ans += pow(2,i)for i in range(0,n) :    if(s[i]=='7') :        ans+=pow(2,n-1-i)print(ans+1)
