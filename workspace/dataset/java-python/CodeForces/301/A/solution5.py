n = int(input())a = list(map(int, input().split()))neg = 0 for i in range(len(a)):    if (a[i] < 0):        neg += 1        a[i] = -a[i]    if (neg % 2 == 0 or n % 2 == 1):    print(sum(a))else:    print(sum(a) - min(a) * 2)
