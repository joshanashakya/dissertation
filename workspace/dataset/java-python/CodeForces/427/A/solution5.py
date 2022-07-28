x=int(input())n=list(map(int, input().split()))prest=0cop=0for i in range(x):    cop+=n[i]    if cop<0:        prest+=1        cop=0print(prest)
