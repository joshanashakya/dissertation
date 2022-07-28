n,d=map(int,input().split())a=list(map(int,input().split()))m=int(input())if m==n:    print(sum(a))elif m<n:    a=sorted(a)    print(sum(a[:m]))else:    x=sum(a)    print(x-(m-len(a))*d)        
