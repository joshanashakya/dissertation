S, M, L, XL, XXL = [int(item) for item in input().split(' ')] models = int(input()) for i in range(models):    size = input()    if size == 'S':        if S > 0:            print('S')            S -= 1        elif M > 0:            print('M')            M -= 1        elif L > 0:            print('L')            L -= 1        elif XL > 0:            print('XL')            XL -= 1        else:            print('XXL')            XXL -= 1     elif size == 'M':        if M > 0:            print('M')            M -= 1        elif L > 0:            print('L')            L -= 1        elif S > 0:            print('S')            S -= 1        elif XL > 0:            print('XL')            XL -= 1        else:            print('XXL')            XXL -= 1    elif size == 'L':        if L > 0:            print('L')            L -= 1        elif XL > 0:            print('XL')            XL -= 1        elif M > 0:            print('M')            M -= 1        elif XXL > 0:            print('XXL')            XXL -= 1        else:            print('S')            S -= 1    elif size == 'XL':        if XL > 0:            print('XL')            XL -= 1        elif XXL > 0:            print('XXL')            XXL -= 1        elif L > 0:            print('L')            L -= 1        elif M > 0:            print('M')            M -= 1        else:            print('S')            S -= 1    elif size == 'XXL':        if XXL > 0:            print('XXL')            XXL -= 1        elif XL > 0:            print('XL')            XL -= 1        elif L > 0:            print('L')            L -= 1        elif M > 0:            print('M')            M -= 1        else:            print('S')            S -= 1 
