t=int(input())x=list(map(int,input().split()))for i in x:    if i%14 >0 and i%14 < 7 and i >=15:        print("YES")    else:        print("NO")
