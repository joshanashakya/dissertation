from collections import Counterfrom collections import Counter def solve():    x,y,z=list(map(int,input().split()))     if x==y and x>=z:        print("YES")        return x,z,z    if y==z and y>=x:        print("YES")        return x,x,z     if x==z and x>=y:        print("YES")        return y,x,y     print("NO") for i in range(int(input())):    val=solve()    if val!=None:        print(val[0],val[1],val[2])
