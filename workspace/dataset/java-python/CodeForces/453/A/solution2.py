m,n=map(int,input().split())score=0for k in range (1,m+1):    score+=k*((k/m)**(n)-((k-1)/(m))**n)   print(score)
