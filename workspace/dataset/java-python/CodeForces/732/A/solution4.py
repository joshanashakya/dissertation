a, b = (int(i) for i in input().split())k = 1c = awhile a % 10 != 0 and a % 10 != b:    k += 1    a = c * kprint(k)
