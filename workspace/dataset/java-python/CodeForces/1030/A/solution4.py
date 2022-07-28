import matht=int(input())a=list(map(int,input().split()))[:t]h=0for i in a:    if(i==1):        h=h+1if(h>0):    print("HARD")else:    print("EASY")
