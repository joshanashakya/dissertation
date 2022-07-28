n=int(input())lst = list(map(int, input().strip().split(' ')))print(n)for i in range(n):    j=lst[i:].index(min(lst[i:]))    lst[i],lst[j+i]=lst[j+i],lst[i]    print(i,j+i,end=" ")    print()
