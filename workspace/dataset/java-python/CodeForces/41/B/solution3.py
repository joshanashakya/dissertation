n, amount = map(int, input().split())a = list(map(int, input().split()))maxd = 0x = 0y=0profit = 0b = [0]*nb[n-1] = -1maxi = 0for i in range(n-2, -1, -1):    maxi = max(maxi, a[i+1])        b[i] = maxifor i in range(n):    if b[i]>0:                profit = max(profit, (amount//a[i])*(b[i]-a[i]))print(amount+profit)
