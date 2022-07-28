n=int(input())a=[int(x) for x in input().split()]a.sort()flag=0for i in range(1,n):    if a[i]%a[0]:        flag=1        breakif flag:    print(-1)else:    print(a[0])
