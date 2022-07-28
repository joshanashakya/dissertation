input()s=input()i=j=2while s[i-1]==s[0]:i+=1while s[-j]==s[-1]:j+=1print((i+j-1,i*j%998244353)[s[0]==s[-1]])
