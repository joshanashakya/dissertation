import mathn=int(input())l=list(map(int,input().split()))c=0d=0for i in l:    if i/1>0:        c+=1for i in l:    if i/(-1)>0:        d+=1if c>=math.ceil(n/2):    print(1)elif d>=math.ceil(n/2):    print(-1)else:    print(0)