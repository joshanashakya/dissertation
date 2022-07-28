x,t,a,b,da,db=map(int,input().split())A=[0]+[a-i*da for i in range(t)]B=[0]+[b-i*db for i in range(t)]flag=0for i in A:	if x-i in B:		print ("YES")		flag=1		breakif(flag==0):    print ("NO")
