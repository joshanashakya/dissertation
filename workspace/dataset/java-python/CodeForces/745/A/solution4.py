a=input()from collections import defaultdictdict=defaultdict(int)for i in range(len(a)):    dict[a]=1    a=a[1:]+a[:1]    print(len(dict))
