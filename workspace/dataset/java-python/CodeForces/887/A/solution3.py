s = input()i = s.find('1')if i == -1:  print('no')else:  if s[i+1:].count('0') < 6:    print('no')  else:    print('yes')
