n = int(input())s = input()pas = 0for i in s:    if i == '>':        break    else:        pas += 1for i in range(n-1,-1,-1):    if s[i] == '<':        break    else:        pas += 1     print(pas)
