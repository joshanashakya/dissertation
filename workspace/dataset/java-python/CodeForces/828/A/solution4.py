n,a,b=map(int,input().split())p=list(map(int,input().split()))count=0c=0for j in p:    if j==1:        if a!=0:            a=a-1        elif b!=0:            b=b-1;            c=c+1;        elif c!=0:            c=c-1;        else:            count+=1    else:        if b!=0:            b=b-1;        else:            count+=2print(count)