def shortSubStr(s):    start = 0    a = ""    while start < len(s):        a+=s[start]        start+=2    a+=s[len(s)-1]    print(a)    return tc = int(input())for _ in range(0,tc):    s = input()    shortSubStr(s)