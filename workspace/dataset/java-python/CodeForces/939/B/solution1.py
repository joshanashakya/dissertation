k , n = map(int , input().split())r = lambda : list(map(int, input().split()))arr = r()x = float('inf') for pos , i in enumerate(arr):    if (k % i) < x:        x = k%i        ans = pos   print(ans+1 , k//arr[ans])