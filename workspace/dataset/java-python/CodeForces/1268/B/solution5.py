n=int(input())a=list(map(int,input().split()))b,w=0,0bb,ww=0,0for i in range(0,n,2):    bb=0    bb=a[i]//2    b+=bb    w+=a[i]-bbfor i in range(1,n,2):    ww=0    ww=a[i]//2    w+=ww    b+=a[i]-wwprint(min(b,w))
