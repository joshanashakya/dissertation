s, ans, met = "", 0, Falsefor i in range(8):    s = input()    if s == "BBBBBBBB":        ans += 1    elif not met:        ans += s.count('B')        met = True print(ans)
