n = int(input())
arr = list(map(int, input().split())) water = [
                                                  0] * n  # Search Rightfor i in range(n):    temp = 1    for j in range(i, n-1):        l = arr[j]        r = arr[j+1]        if l >= r:            temp +=1        else: break;    water[i] += temp# Search Leftfor i in range(n-1,-1, -1):    temp = 0    for j in range(i, 0, -1):        r = arr[j]        l = arr[j - 1]        if l<=r:            temp+=1        else: break;    water[i]+=tempprint(max(water))
