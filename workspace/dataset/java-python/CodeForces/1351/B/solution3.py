import sysdef get_list ():    return  list (map (int, sys.stdin.readline ().strip ().split ()))for i in range (int (input ())):    a = get_list ()    a1 = get_list ()    if max (a) == max (a1):        if min (a) + min (a1) == max (a):            print ('Yes')        else:            print ('NO')     else:        print ('NO')  
