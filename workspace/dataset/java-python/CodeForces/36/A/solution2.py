'''input()line = input()new_line = line[line.index('1') + 1: line.rindex('1')]n = 0m = 0ans = 'YES'for item in new_line:    if item != '1':        n += 1    else:        breakfor item in new_line:    if item != '1':        m += 1    if item == '1':        if m != n:            ans = 'NO'            break        else:            m = 0print(ans)   0123456789.....#"001001000100000"''' rfile = open('input.txt', 'r')n, text, prev, dist, ans = int(rfile.readline()), rfile.readline(), -1, -1, 'YES'rfile.close()for i in range(n):    if text[i] == '1' and prev == -1:        prev = i    elif text[i] == '1' and dist == -1:        dist = i - prev - 1        prev = i    elif text[i] == '1':        currDist = i - prev - 1        if currDist != dist:            ans = 'NO'            break        prev = i wfile = open('output.txt', 'w')wfile.write(ans)wfile.close()
