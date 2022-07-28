n = int(input())l = [int(x) for x in input().split()]b = [0]*(n+1)for i in l:    b[i] = b[i-1]+1print(n-max(b))  
