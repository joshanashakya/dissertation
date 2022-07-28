for _ in range(int(input())):    n=int(input())    a=input().split('A')    max1=0    for i in range(1,len(a)):        max1=max(max1,len(a[i]))    print(max1)  
