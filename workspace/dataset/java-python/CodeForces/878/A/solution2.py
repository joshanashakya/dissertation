'''n = int(input())a = []for i in range(n):    sign, x = map(str, input().split())    a.append( (sign, int(x)) )for X in range(1024):    res = X    for j in range(n):        if a[j][0] == '|':            res |= a[j][1]        elif a[j][0] == '^':            res ^= a[j][1]        else:            res &= a[j][1]    print("X equal to " + str(X) + "  " + str(res))        ''' # consider all value in statement are in bunary representation# X = X9  X8 ... X1 X0# | & ^# a = a9  a8 ... a1 a0#----------------------# 0 or 1 or X or X''''0 -- > 01 -- > 1x -- > 2x' -- > 3'''from sys import stdininput = stdin.readlinedef check(x, b, c):    if b == '|':        if c == '1':            return 1        else:            return x    elif b == '&':        if c == '1':            return x        else:            return 0    else:        if c == '1':            if x == 3: return 2            if x == 2: return 3            if x == 1: return 0            if x == 0: return 1        else:            return x n = int(input())a = []op = []for i in range(n):    sign, x = map(str, input().split())    op.append(sign)    a.append( bin(int(x))[2:].rjust(10, '0') )#print(a)And = 1023Or = 0Xor = 0for i in range(10):    result = 2    for j in range(n):        result = check(result , op[j], a[j][i] )    #print(result)    if result == 0: # bit i alwase 0  # and with 1023 - 2**(9-i)        And-= ( 1 << (9 - i) )    elif result == 1: # bit i alwase 1        Or+= ( 1 << (9 - i) )    elif result == 3: # bit i alwase x'        Xor+= ( 1 << (9 - i) )      print(3)print('&', And)print('|', Or)print('^', Xor)
