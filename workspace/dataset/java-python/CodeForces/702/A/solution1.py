n = int(input())arr = list(map(int, input().split()))j = 0f = [0]*nfor i in range(n-1):    f[j] += 1    if arr[i+1] <= arr[i]:        j = j+1if arr[n-1] >= arr[n-2]:    f[j]+=1f.sort()print(f[n-1])
