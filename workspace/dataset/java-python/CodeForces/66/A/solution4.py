n = int(input())
if -(2 ** 7) <= n <= 2 ** 7 - 1:
    print("byte")else:
    if
-(2 ** 15) <= n <= 2 ** 15 - 1: print("short") else:    if -(2 ** 31) <= n <= 2 ** 31 - 1:
    print("int")    else:
    if
-(2 ** 63) <= n <= 2 ** 63 - 1: print("long") else:        print("BigInteger")
