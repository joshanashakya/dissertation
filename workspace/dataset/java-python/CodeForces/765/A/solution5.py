t= int(input())a=input()bal=0for _ in range(t):    b=input().split('->')    if(b[0]==a):        bal+=1    if(b[1]==a):        bal-=1if(bal==0):    print("home")else:    print("contest")
