n = int(input())a = [int(i) for i in input().split(' ')]output = 0for i in range(n):    if (a[i]>= 0):        output += a[i]    else:        output -= a[i]print(output)
