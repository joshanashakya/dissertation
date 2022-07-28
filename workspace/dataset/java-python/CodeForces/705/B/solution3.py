n=int(input())l=list(map(int,input().split()))v=0for i in l:    v^=i-1    if(v&1):        print(1)    else:        print(2)
