n=int(input())bt=list(map(int,input().split()))bt.sort()day=1for a in range(n):    if day<=bt[a]:        day+=1print(day-1)
