import sys n, k = map(int, input().split())a = list(map(int, input().split()))c = 0sum_ = sum(a)len_ = len(a)while sum_ / len_ < k - 0.5:    sum_ += k    len_ += 1    c += 1print(c)
