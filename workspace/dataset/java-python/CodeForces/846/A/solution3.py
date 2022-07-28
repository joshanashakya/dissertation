n = int(input())projects = input().split(' ') best = 0for i in range(len(projects)):	cur = 1	cur += projects[:i].count('0')	cur += projects[i+1:n].count('1')	best = max(best, cur) print(best)
