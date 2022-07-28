x=int(input())for i in range(x):    n,m=[int(a) for a in input().split()]    if(2*min(n,m)<max(m,n) or (n+m)%3):        print("NO")    else:        print("YES")
