quantity = int(input())left_doors = []right_doors = [] for i in range(quantity):    temp = input()    left = int(temp[0])    right = int(temp[2])    left_doors.append(left)    right_doors.append(right) left_doors.sort()if len(left_doors) % 2 == 0:    if left_doors[len(left_doors) // 2 - 1] == left_doors[len(left_doors) // 2]:        x = left_doors[len(left_doors) // 2 - 1]    else:        x = left_doors[len(left_doors) // 2]else:    x = left_doors[len(left_doors) // 2] right_doors.sort()if len(right_doors) % 2 == 0:    if right_doors[len(right_doors) // 2 - 1] == right_doors[len(right_doors) // 2]:        y = right_doors[len(right_doors) // 2 - 1]    else:        y = right_doors[len(right_doors) // 2]else:    y = right_doors[len(right_doors) // 2]  secs = (len(left_doors) - left_doors.count(x)) + (len(right_doors) - right_doors.count(y))print(secs)