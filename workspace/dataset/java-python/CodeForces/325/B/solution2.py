showed = Falsedef func(num, twos):    ash = num    num = int(num)    num = (num)*(num-1)    num //= 2    num = num + ( ash*((2**twos) -1) )    return num def decide(twos, num):    global showed    low , hi = int(0), int(1e18)    ans = int(-1)    while(low <= hi):        mid = (low+hi)//2        pk = (mid*2) - 1        if(func(pk, twos) <= num):            ans = pk            low = mid+1        else:            hi = mid-1    if(func(ans, twos) == num):        showed = True        print(ans*(2**twos)) ash = int(input()) for i in range(0, 65):    decide(i, ash)  if(showed == False):    print(-1) 