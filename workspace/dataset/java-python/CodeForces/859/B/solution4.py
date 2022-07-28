import mathn=int(input())if (math.sqrt(n)).is_integer():    print(int(math.sqrt(n)*4))else:    n1 = int(math.sqrt(n))    if (n-(math.pow(n1,2)))>n1:        print(n1*4+4)    else:        print(n1*4+2)
