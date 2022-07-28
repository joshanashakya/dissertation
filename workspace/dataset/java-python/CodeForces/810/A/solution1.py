a=[int(x) for x in input().split()]b=[int(y) for y in input().split()]sum1=0for z in b:    sum1=sum1+zavg=sum1/a[0]if(avg>=(a[1]-0.5)):    print(0)else:    print(((2*a[1]-1)*a[0])-(2*sum1))    
