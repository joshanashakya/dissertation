n=int(input())m=pow(10,9)+7if n==0:    print(1)else:    print((pow(2,2*n-1,m)+pow(2,n-1,m))%m)
