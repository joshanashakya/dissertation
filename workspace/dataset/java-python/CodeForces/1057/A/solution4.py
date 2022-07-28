n=int(input()) p=list(map(int, input().split())) pa=n ans=[] while True:    ans.append(pa)    if pa==1:        break    pa=p[pa-2]print(*ans[::-1])
