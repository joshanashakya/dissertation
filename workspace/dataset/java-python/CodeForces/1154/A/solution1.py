l = list((map(int, input().split())))l = sorted(l)k_ = [] for i in range(3):    k_.append(l[3]-l[i])print(*k_)
