a,b=map(int,input().split())c,d=map(int,input().split())ans="-1"while b<100000:    if b==d:        ans=b        break    elif b>d:        d+=c    else:        b+=aprint(ans)
