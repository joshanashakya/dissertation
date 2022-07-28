n=int(input())l=list(map(int,input().split()))ev=0od=0 for i in range(len(l)):    if(l[i]%2==0):        ev+=1    else:        od+=1 print(min(ev,od))
