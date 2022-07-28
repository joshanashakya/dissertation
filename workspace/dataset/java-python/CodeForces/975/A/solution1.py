n = int(input())s = list(str(input()).split(" "))k = set([frozenset(i) for i in s])print(len(k))
