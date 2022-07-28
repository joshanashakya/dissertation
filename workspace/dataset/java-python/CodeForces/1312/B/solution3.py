t=int(input())for i in range(t):    n=int(input())    v=list(map(int,input().split()))    v.sort()    print(*v[::-1],sep=" ")
