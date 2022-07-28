n = int(input())a,b,c = 1,2,3for _ in range(n):    x = int(input())    if x==c:        print("NO")        exit()    t1 = x    t2 = a+b-x    t3 = c    a= t1    b= t3    c = t2 print("YES")
