def solution(skip_amount, current_time):    left, right = input().strip().split()    left = int(left)    right = int(right)     while current_time + skip_amount <= left:        current_time += skip_amount     time_watched = right - current_time + 1    return time_watched, current_time+time_watched  n, x = input().strip().split()n = int(n)x = int(x)current_time = 1net = 0 for i in range(n):    time_watched, new_current_time = solution(x, current_time)    net += time_watched    current_time = new_current_time print(net)