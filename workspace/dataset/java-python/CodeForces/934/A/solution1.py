n,m = map(int,input().split())arr1 = sorted(map(int,input().split()))arr2 = sorted(map(int,input().split()))if arr1[-1]*arr2[-1]>arr1[0]*arr2[0]:    l = max(arr1[-2]*arr2[-1],arr1[0]*arr2[0])    if n>2:        l = max(l,arr1[1]*arr2[-1])    if m>2:        l = max(l,arr1[-2]*arr2[0])else:    l = max(arr1[-1]*arr2[-1],arr1[1]*arr2[0])    if n>2:        l = max(l,arr1[1]*arr2[-1])    if m>2:        l = max(l,arr1[-2]*arr2[0])print(l)
