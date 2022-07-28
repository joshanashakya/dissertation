num = int(input())arr = list(map(int, input().split()))ct = 0for i in range(len(arr)-2):    if arr[i] <arr[i+1]> arr[i+2] or arr[i] > arr[i+1] < arr[i+2]:        ct += 1 print(ct)    
