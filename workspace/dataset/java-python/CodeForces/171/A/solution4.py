import mathimport sysinput = sys.stdin.readline def inp():    return(int(input()))def inlt():    return(list(map(int,input().split())))def reverse_number(n):    r = 0    while n > 0:        r *= 10        r += n % 10        n //= 10    return rm, s = inlt()print(m + reverse_number(s))
