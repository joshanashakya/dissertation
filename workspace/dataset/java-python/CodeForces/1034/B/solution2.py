known = [    [0, 0, 0, 0, 0, 0],    [0, 0, 0, 0, 2, 4],    [0, 0, 0, 4, 8, 10],    [0, 0, 4, 8, 12, 14],    [0, 2, 8, 12, 16, 20],    [0, 4, 10, 14, 20, 24]]n,m = map(int,input().split(" "))if n>m:    n,m = m,nif n<=5 and m<=5:    print(known[m][n])elif n==1:    print(6*(m//6)+ [0,0,0,0,2,4][m%6])elif n==2:    if m==7:        print(12)    else:        print(2*m)else:    print(2*int((m*n)//2))