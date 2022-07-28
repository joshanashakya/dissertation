 cost = [int(i) for i in input().split()]s = input() total = 0 for i in s:    total += cost[int(i) - 1]    print(total)
