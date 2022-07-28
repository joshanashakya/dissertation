n = int(input())a = [int(y) for y in input().split()]a.sort()ans = -1for i in range(1,n+1):    if a[i-1] != i:        ans = i        breakif ans == -1:    print(n+1)else:    print(ans)
