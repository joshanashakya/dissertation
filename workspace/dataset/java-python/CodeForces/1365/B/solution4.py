t=int(input())for _ in range(t):    n=int(input())    li=list(map(int,input().split(" ")))    indexes=list(map(int,input().split(" ")))     if 0 in indexes and 1 in indexes:        print("YES")    else:        if list(sorted(li))==li:            print("YES")        else:            print("NO")  
