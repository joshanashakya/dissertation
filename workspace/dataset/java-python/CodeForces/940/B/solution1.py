n = int(input())k = int(input())a = int(input())b = int(input()) ans = 0 if k==1:    ans+=(n)*a - aelse:    while n>1:        if n%k>0:            if n<k:                ans+=(n%k)*a - a;n-=(n%k)            else:                    ans+=(n%k)*a;n-=(n%k)        else:            ans+=min((n - (n//k))*a , b)            n=n//kprint(ans)   