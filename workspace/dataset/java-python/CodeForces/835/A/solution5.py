s,v1,v2,t1,t2=map(int,input().split())x=(s*v1)+(t1*2)y=(s*v2)+(t2*2)if(x<y):    print("First")elif(x>y):    print("Second")else:    print("Friendship")
