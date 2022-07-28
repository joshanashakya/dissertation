a = list(map(int, input().split(" ")))mx = max(a)for i in list(map(lambda x: mx - x, a)):    if i:        print(i, end = " ")print()
