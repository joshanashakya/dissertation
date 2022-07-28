l,r,x,y,k=(int(x) for x in input().split())for i in range(x,y+1):        if  k*i<=r and k*i>=l :            print("YES")            exit(0)print("NO")
