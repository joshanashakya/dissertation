n=int(input())l=list(map(int,input().split()))c=0if(sum(l)%2==0):    for i in l:        if(i%2==0):            c=c+1else:    for i in l:        if(i%2!=0):            c=c+1print(c)
