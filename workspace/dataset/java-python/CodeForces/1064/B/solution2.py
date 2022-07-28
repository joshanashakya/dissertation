t = int(input())for i in range(t):    a = int(input())    b = format(a, 'b')    #print(b)    ans = 1    for c in b:        if c == '1':            ans *= 2    print(ans)
