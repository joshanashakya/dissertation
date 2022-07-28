n,a,b=map(int,input().split())itog=0for i in range(1,n+1):    if i-1>=a and n-i<=b:        itog+=1print(itog)        
