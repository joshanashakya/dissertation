a, b  = map(int, input().split())for i in range(a):    curStr = input()    if 'C' in curStr or 'M' in curStr or 'Y' in curStr:        print("#Color")        breakelse:    print("#Black&White")
