# s="0123"s=""for i in range(10):    z=str(i)*4        print(z)    a,b=input().split()    b=int(b)+int(a)    if(b!=0):        s+=str(i)        if(len(s)==4):            breakfrom itertools import permutations perm = permutations(s)for i in perm:    s=""    for j in i:        s+=j    print(s)    a,b=input().split()    a=int(a)    if(a==4):        print(s)        break#     print(i)