import sysinput = sys.stdin.readlinen = int(input())k = int(input())a = int(input())b = int(input())ans = 0if k==1:    print((n-1)*a)    exit()while n>1:    if n<k:        ans+= (n-1)*a        break    if n%k!=0:        ans+= (n%k)*a        n-= (n%k)    else:        while n%k==0 and n>1:            temp = n//k            if (n-temp)*a>=b:                ans+=b            else:                ans+= ((n-temp)*a)            n//=kprint(ans)