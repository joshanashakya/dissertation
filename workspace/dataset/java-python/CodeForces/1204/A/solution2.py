n = input() l = len(n)   if l % 2== 0:    print(int(l/2))else:    c = n.count('1')        if c > 1:        print(int(l/2)+1)    else:        print(int(l/2))
