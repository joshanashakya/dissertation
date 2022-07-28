peoples =int(input())arr = list(map(int,input().split()))count = 0max_ = max(arr)for num in arr:    count += max_-numprint(count)
