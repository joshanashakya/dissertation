n = int(input()) li = list(map(int,input().split())) k = 0 for i in range(1,n-1):    if li[i]<li[i+1] and li[i]<li[i-1] or li[i]>li[i-1] and li[i]>li[i+1]:        k= k+1  print(k)
