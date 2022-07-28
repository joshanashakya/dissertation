x,y,z=map(int,input().split())total=x//z+y//zif total==(x+y)//z:    print(total,0)else:    print(total+1,min((z-x%z),(z-y%z)))
