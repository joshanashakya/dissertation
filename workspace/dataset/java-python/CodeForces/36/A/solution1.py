with open('input.txt','r') as f:    fs = f.read().strip().split('\n') n = [int(i) for i in fs[1]]c = -1i, ans = 0, "YES"while i < len(n):    if n[i] == 1:        count = 0        while i + 1 < len(n):            if n[i + 1] == 1:                break            count += 1            i += 1        else:            count = c        if c == -1:            c = count        elif c != count:            ans = "NO"            break    i += 1 with open('output.txt','w') as f:    f.write(ans)        