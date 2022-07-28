x=int(input())ar=list(map(int,input().split()))[:x]b=list(map(int,input().split()))[:x]ars=sum(ar)brs=sum(b)if(brs<=ars):    print("Yes")else:    print("No")
