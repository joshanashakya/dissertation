x = int(input())h,  m = map(int, input().split()) y = 0while 1:    if str(h).find('7') >= 0 or str(m).find('7') >= 0:        break     y += 1    m -= x    if m < 0:        h -= 1        m += 60        if h < 0:            h += 24 print(y)