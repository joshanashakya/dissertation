d= int(input())n = int(input())a = list(map(int,input().split()))count = 0for i in range(len(a)-1):         count+=d-a[i]         print(count)
