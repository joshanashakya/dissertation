n = int(input())sum = 0result = 0i = 1count = 0while sum <= n:    result += i    sum += result    if sum > n:        break    i += 1    count += 1print(count)
