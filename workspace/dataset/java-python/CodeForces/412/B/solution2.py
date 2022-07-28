a , b = map(int , input().split()) r = lambda : list(map(int, input().split()))arr = r()arr.sort(reverse= True)print(min(arr[:b]))
