# coding: utf-8 l, r = map(int, input().split()) for x in range(l, r + 1):  if len(list(str(x))) == len(set(str(x))):    print(x)    exit()    print(-1)
