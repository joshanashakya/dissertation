num = int(input()) ans = [] while num:    ans.append(1)    while len(ans) > 1 and ans[-1] == ans[-2]:        x = ans.pop() + 1        ans[-1] = x    num -= 1print(*ans) 
