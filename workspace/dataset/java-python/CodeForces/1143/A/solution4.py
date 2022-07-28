n = int(input())s = list(map(int, input().split()))rev = s[::-1] ind1 = rev.index(1)ind2 = rev.index(0) print(min(n-ind1, n - ind2))# print(rev)# print(ind1)# print(ind2)    
