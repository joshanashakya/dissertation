t=int(input())while t>0:    t-=1    s,d=[int(x) for x in input().split()]    print(min(s,d,(s+d)//3))
