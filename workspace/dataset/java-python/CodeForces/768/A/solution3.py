n=int(input())x=list(map(int,input().split())) x.sort() mini=x[0]maxi=x[-1]c1=0c2=0for i in range(n):    if x[i]==maxi:        c1+=1    if x[i]==mini:        c2+=1 if maxi==mini:    print(0)else:    print(n-c1-c2)  
