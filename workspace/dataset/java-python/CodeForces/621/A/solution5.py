n=int(input())l=list(map(int,input().split()))odd=[i for i in l if i&1==True]if(sum(l)%2==0):    print(sum(l))else:    print(sum(l)-min(odd))
