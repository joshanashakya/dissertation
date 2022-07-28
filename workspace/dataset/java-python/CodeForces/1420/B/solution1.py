from math import log2 for t in range(int(input())):    n = int(input())
a = list(map(int, input().split()))     d = dict()     for i in range(len(a)):        a[i] = int(log2(a[
                                                                                                          i]))   # print(a)     for i in range(len(a)):        if a[i] not in d:            d[a[i]] = 1        else:            d[a[i]] += 1     # print(d)     sm = 0     for key in d:        sm += int(d[key]*(d[key] - 1)/2)     print(sm) 
