n = int(input())d = list(map(int, input().split()))s1 = 0s2 = 0for i in d:    if i > 0:        s1 += i    else:        s2 += iprint(s1 - s2)
