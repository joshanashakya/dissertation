def median(arr):    n = len(arr)    return (n-1)//2 from math import ceil,floor n,m,d = map(int,input().split(' '))arr = []for i in range(n):    x = [int(w) for w  in input().split(' ') ]    for item in x:        arr.append(item)arr.sort() if (n*m)%2==0:    x = arr[median(arr)]    y = arr[median(arr) + 1]    ans  = 0    for item in arr:        f = (abs(item) - x)/d        if ceil(f) == floor(f):            ans = ans + abs(f)        else:            ans = -1            break    ans1 = 0    for item in arr:        f = (abs(item) - y)/d        if ceil(f) == floor(f):            ans1 = ans1 + abs(f)        else:            ans1 = -1            break       if ans==-1 and ans1==-1:        ans = - 1     else:        if ans==-1:            ans = ans1        elif ans1==-1:            ans = ans         else:            ans = min(ans1,ans)     else:    ans = 0    x = arr[median(arr)]    for item in arr:        f = (abs(item) - x)/d        if ceil(f) == floor(f):            ans = ans + abs(f)        else:            ans = -1            breakprint(int(ans))