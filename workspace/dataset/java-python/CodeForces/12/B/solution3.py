n = sorted(list(input())) # tem zeros ou n ne zeros = n.count('0')ans = '' if zeros == len(n):    ans = '0'else:    for i in range(len(n)):        if n[i] != '0':            ans += n[i]                if len(ans) == 1:            ans += zeros * '0' if ans == input():    print('OK')else:    print('WRONG_ANSWER')