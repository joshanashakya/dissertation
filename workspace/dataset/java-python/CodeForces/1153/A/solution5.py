def getKey(arr):    return arr[0]a = input().split()n = int(a[0])t = int(a[1])time = []for i in range(n):    b = input().split()    s = int(b[0])    d = int(b[1])    while s < t:        s += d    time.append((s,i))time.sort(key=getKey)print(time[0][1] + 1)  