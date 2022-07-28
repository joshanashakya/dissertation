n, s = [int(x) for x in input().split(' ')]v = [int(x) for x in input().split(' ')] if sum(v) < s:    ans = -1else:    ans = min(min(v), (sum(v) - s) // n)print(ans) 
