try:    s = input()    k = int(input())    c = list(map(int, input().split()))    x = max(c)    cost = 0    for i in range(len(s)):        cost += c[ord(s[i])-97]*(i+1)    for i in range(len(s), len(s)+k):        cost += (i+1)*max(c)    print(cost)except:    pass