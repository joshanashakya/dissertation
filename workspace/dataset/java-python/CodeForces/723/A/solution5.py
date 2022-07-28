friend_coordinate = list(map(int, input().split()))min_value = min(friend_coordinate)max_value = max(friend_coordinate) mid = (min_value + max_value) // 2print((max_value-mid) + (mid - min_value))
