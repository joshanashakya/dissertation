a,b = input().split() l = max(map(len,[a,b]))a,b = a.zfill(l),b[::-1].zfill(l) print(int(a)+int(b))
