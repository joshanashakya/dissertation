import sysimport os.pathif os.path.exists('input.txt'):    sys.stdin = open('input.txt','r')    sys.stdout = open('output.txt','w')s=input()n=len(s)ans=0for i in range(n-2,-1,-1):    if int(s[i]+s[i+1])%4==0:        ans+=i+1for i in range(n):    if int(s[i])%4==0:        ans=ans+1print(ans)                            
