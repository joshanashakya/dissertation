import sysn = int(input())arr = list(map(int, sys.stdin.readline().rstrip().split(" ")))l = len(arr)g = 0a = 0if n == 1:    print("-1")elif n == 2:    for i in range(l-1):        if int(arr[i]) != int(arr[i+1]):            print("1")            print("1")        else:            print("-1")else:    for i in range(l-1):        if int(arr[i] <= arr[i+1]):            print("1")            print("1")            break        else:            print("1")            j = arr.index(arr[i+1])            print(j+1)            break     #print(g, a)   
