n=int(input())lst = list(map(int, input().strip().split(' ')))l=[]for j in range(n):    l.append([lst[j],j])l.sort(key = lambda x: x[0])c=0for i in range(1,n):    c+=abs(l[i][1]-l[i-1][1])print(c)
