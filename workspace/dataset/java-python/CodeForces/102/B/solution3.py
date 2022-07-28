def change(s):    x = 0    for i in s:        x += ord(i) - ord('0')    return str(x)  s = input() c = 0while len(s) > 1:    s = change(s)    c += 1  print(c)
