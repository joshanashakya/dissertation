n = int(input())s = input()bal = 0for c in s:    if c == '0':        bal += 1    else:        bal -= 1if bal != 0:    print('1' + '\n' + s)else:    print('2' + "\n" + s[0:-1] + " " + s[-1])
