from sys import stdin, stdout outputs = []
t = int(stdin.readline().strip())
for __ in range(t):    n = int(stdin.readline().strip())
res = [n + 2] * n
arr = [int(num) for num in stdin.readline().strip().split()]
req = [[-1, -1, -1] for i in range(
    n + 1)]  # print(req)    for i in range(n):        if req[arr[i]][0] == -1:            req[arr[i]][0] = i            req[arr[i]][1] = max(i+1, n-i)            req[arr[i]][2] = 1        elif req[arr[i]][2] == 1:            req[arr[i]][2] += 1            req[arr[i]][1] = max(req[arr[i]][0]+1, i-req[arr[i]][0])            req[arr[i]][0] = i        else:            req[arr[i]][2] += 1            req[arr[i]][1] = max(req[arr[i]][1], i - req[arr[i]][0])            req[arr[i]][0] = i        #print(req)    for i in range(n):        if req[arr[i]][2] > 1:            req[arr[i]][1] = max(req[arr[i]][1], n - req[arr[i]][0])    for i in range(n):        res[req[arr[i]][1]-1] = min(arr[i], res[req[arr[i]][1]-1])    i = 0    while i<n and res[i] == n+2:        res[i] = '-1'        i += 1    cur_minm = -1 if i>n else res[i]    while i < n:        cur_minm = min(cur_minm, res[i])        res[i] = f'{cur_minm}'        i += 1    outputs.append(' '.join(res))for output in outputs:    stdout.write(output+'\n')                 
