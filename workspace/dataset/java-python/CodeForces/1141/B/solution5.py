n = int(input())hours = [int(i) for i in input().split()]hours += hourscounter = 0max_rest = 0for hour in hours:    if hour == 1:        counter += 1        if counter > max_rest:            max_rest = counter    else:        counter = 0print(max_rest)