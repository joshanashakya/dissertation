t = int(input()) while t:    size, string = int(input()), input()     for i in range(0, len(string), 2):        print(string[i], end='')    print()         t -= 1
