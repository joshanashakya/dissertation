a,b = map(int,input().split())sum=0k=1 while a or b:    sum+=k*(((b%3)-(a%3))%3)    a//=3    b//=3    k*=3print(sum)
