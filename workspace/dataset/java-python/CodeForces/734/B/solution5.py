k = list(map(int, input().split()))max_nums = (min(k[0],k[2],k[3]))v = max_nums * 256if k[0] - max_nums > k[1]:    s = k[1] * 32else:    s = (k[0] - max_nums) * 32print(v + s)
