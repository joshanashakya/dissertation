input()s = input()if s.find('000') != - 1 or s.find('11') != -1 or s == '0' or (s[0] == '0' and s[1] == '0') or (s[-1] == '0' and s[-2] == '0'):    print('NO')else:    print('YES')
