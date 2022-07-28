inp=list(map(int,input().split()))n=inp[0]k=inp[1]li=list(map(int,input().split()))c=0val=li[k-1]for i in li:    if i>=val and i>0:        c+=1print(c)
