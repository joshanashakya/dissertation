from sys import stdin, stdoutn = int(input())arr = []d = dict()for i in range(n):    x = tuple([int(x) for x in stdin.readline().split()])    d[x] = 1    arr.append(x)    cnt = 0for i in range(n - 1):    for j in range(i + 1, n):                sum1 = arr[i][0] + arr[j][0]        sum2 = arr[i][1] + arr[j][1]                if (sum1/2 == sum1//2) and (sum2/2 == sum2//2):            tup=(sum1//2,sum2//2)            if d.get(tup):                cnt+=1;                print(cnt)
