n=int(input())ans=0 ans+=int(n/100)n=n%100ans+=int(n/20)n=n%20ans+=int(n/10)n=n%10ans+=int(n/5)n=n%5ans+=nprint(ans)
