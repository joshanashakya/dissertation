info = [int(x) for x in input().split()]problem_times = [int(x) * 5 for x in range(1, info[0] + 1)]time_to_do = 240 - info[1]problems_done = 0 for index, i in enumerate(problem_times):    if time_to_do >= problem_times[index]:        time_to_do -= i        problems_done += 1    else:        breakprint(problems_done)
