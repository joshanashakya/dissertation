n = int(input())nums = [int(j) for j in input().split()]ref = n * [0]for j in range(n - 1):    ref[nums[j] - 1] = 1for j in range(n):    if ref[j] == 0:        print(j + 1)        break
