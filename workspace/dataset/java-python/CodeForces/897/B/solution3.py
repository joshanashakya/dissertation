"""    Chtholly's request    You can solve it recursively"""import math, sysdef nextZCY(num): #num always is even    num = str(num)    length = len(num)    for counter in range((length//2), 0,-1):        findex = counter        sindex = len(num) - findex + 2        if(num[findex-1] == '9'):            continue        else:            numToAdd = math.pow(10, findex) + math.pow(10, findex-1)            return(int(num) + int(numToAdd))    numToAdd = 9 * int(math.pow(10, length)) + 2    return (int(num) + int(numToAdd))k, p = [int(x) for x in input().split()]zcy = 11sumKs = zcyfor i in range(k-1):    zcy = nextZCY(zcy)    sumKs += zcyprint(sumKs % p)
