n = int(input())s = input() while 'ogo' in s:    x = s.replace("ogo" , "***" , 1)    while x!=s:        s = x        x = s.replace("*go" , '*')  print(s)
