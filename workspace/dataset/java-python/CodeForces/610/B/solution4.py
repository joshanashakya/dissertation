n = int(input())litres = list(map(int,input().split()))mini = 10**9+1for i in range(n):    if mini>=litres[i]:        mini = litres[i]        last = ifor i in range(n):    if litres[i]==mini:        first = i        breaklitres += litres[:first+1]maxi = 0prev = firstif first==last:    print(mini*n+n-1)else:    for i in range(first+1,n+first+1):        if litres[i]==mini:            if maxi<i-prev:                maxi = i-prev            prev = i    print(mini*n+maxi-1)