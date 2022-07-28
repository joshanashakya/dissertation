x,y=map(int,input().split())number=list(map(int,input().split()))count=0 value=number[y-1]for i in number:    if i >0:        if i>=value:            count+=1print(count)
