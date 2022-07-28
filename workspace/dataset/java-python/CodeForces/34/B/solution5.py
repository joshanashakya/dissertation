n, m = map(int, input().split())lst = [*map(int, input().split())]lst.sort() total = 0 for num in lst[:m]:    if num > 0:        break    else:        total += numprint(abs(total))
