from collections import Countern, m = map(int, input().split())c = Counter(input().split()).values()d = 1while sum(ci//d for ci in c) >= n:    d += 1print(d - 1) 
