n=int(input())a=[int(x) for x in input().split()]c=0flag=0for i in range(n):    if a[i]%2!=0:        flag=1        breakif flag==1:    print('First')else:    print('Second') 
