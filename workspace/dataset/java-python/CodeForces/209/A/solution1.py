n = int(input()) if n != 1 :     array = [1 for k in range(n+1)]     array[1] = 1     array[2] = 2     sumi = 3     for k in range(3,n+1) :         array[k] = array[k-1] + array[k-2]  %int(1e9 +7)        sumi += array[k] %int(1e9 +7)    print(sumi %int(1e9 +7))else :    print(1)