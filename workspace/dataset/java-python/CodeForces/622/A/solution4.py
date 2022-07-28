n = int(input()) n -= 1count = 0ans_pos = 0i = 1while n >= 0:    ans_pos = n    n -= i    #print(i, ans_pos, n)    i += 1    count += 1  print(ans_pos+1)
