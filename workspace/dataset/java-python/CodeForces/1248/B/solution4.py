n = int(input())li = list(map(int, input().split()))li.sort()i = 0j = n-1w = 0h = 0if n == 1:    print(li[0]**2)else:    while i < j:        h += li[i]        w += li[j]        i += 1        j -= 1        if i == j:            w += li[i]            break    print(h**2+w**2)
