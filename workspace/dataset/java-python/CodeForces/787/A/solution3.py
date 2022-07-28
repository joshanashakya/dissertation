a,b=map(int,input().split())c,d=map(int,input().split()) for i in range(101):    for j in range(101):        if a*i+b==c*j+d:            print(a*i+b)            exit()print(-1)
