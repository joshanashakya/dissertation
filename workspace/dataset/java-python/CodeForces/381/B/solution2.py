from collections import Counter, OrderedDictfor _ in range(1):    n = int(input())    arr = list(map(int , input().split()))     hashMap = Counter(arr)    maxx = max(arr)    for i in hashMap:        if hashMap[i] > 2:            hashMap[i] = 2         hashMap[maxx] = 1    total = 0    for i in hashMap:        total += hashMap[i]     output = []    hashMap = OrderedDict(sorted(hashMap.items()))    for i in hashMap:        if hashMap[i] != 0:            output.append(i)            hashMap[i] -= 1     hashMap = OrderedDict(sorted(hashMap.items(), reverse=True))     for i in hashMap:        if hashMap[i] != 0:            output.append(i)            hashMap[i] -= 1      output = list(map(str, output))    print(total)    print(" ".join(output))