def prod(num):    if(num==0):        return 1    if(num<=9):        return num    return max(num%10 * prod(num//10),9*prod(num//10-1))n = int(input())print(prod(n))
