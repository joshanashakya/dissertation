s = input()n = len(s)base = 0for i in range(0, n):  base = base + 2**inews = ""for c in s:  if c == '4':    news = news + '0'  else:    news = news + '1'news = '0b' + newsprint(int(news, 2) + base)
