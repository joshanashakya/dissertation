x = int(input()) arr = list(map(int,input().split()))[:x]arr.sort() cur = 1for i in arr:    if i >= cur :        cur += 1    else :        i += 1    print(cur)
