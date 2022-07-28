n , k = map(int,input().split())arr = list(map(int,input().split()))count = 0teams = 0for num in arr:    if num+k <= 5:        count += 1print(count//3)
