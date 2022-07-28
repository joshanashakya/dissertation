n,m,a,b=map(int,input().split())s=input()su=0for i in s:    if(i=='1'):        su+=n    elif(i=='2'):        su+=m    elif(i=='3'):        su+=a    else:        su+=bprint(su)
