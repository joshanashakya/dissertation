n,d = map(int, input().split())cor = list(map(int, input().split()))count = 2for i in range(1,len(cor)):    if abs(cor[i]-cor[i-1]) > 2*d:        count+=2    elif abs(cor[i]-cor[i-1])==2*d:        count+=1    else:        continue print(count)
