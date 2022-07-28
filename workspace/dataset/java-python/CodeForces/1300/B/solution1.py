t=int(input())for a in range(t):    n=int(input())    bt=list(map(int,input().split()))    bt.sort()    print(abs(bt[n-1]-bt[n]))
