t = str(input())s = str(input()) if len(t) != len(s):    print(max(len(t), len(s)))else:    if t == s:        print("-1")    else:        print(len(t))
