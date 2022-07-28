n = int(input())arr = list(map(int,input().split()))s = sum(abs(arr[i]-arr[i-1]) for i in range(1,n))print(s+ abs(arr[0]))
