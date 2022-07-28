s = input()a = s.count('-')b = len(s)-aif not a or not b: print('YES')elif a%b==0: print('YES')else: print('NO')
