s = input().split('<')[1:]level = -1arr = set()f = Falsefor i in s:    f = False    if i[0]!='/':        f = True     if f: level+=1    print(" "*(2*level) + '<' + i)    if not f: level-=1    # print(2*level) 