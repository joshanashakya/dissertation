import sys n, k = map(int, sys.stdin.readline().split())msa = [int(i) for i in sys.stdin.readline().split()]msb = [int(i) for i in sys.stdin.readline().split()]sch = 1for i in range(n // k):    cha = msa[i]    chb = msb[i]    chx = (pow(10, k) - 1) // cha + 1    if chb != 0:        chx = chx - (pow(10, k - 1) * (chb + 1) - 1) // cha + (pow(10, k - 1) * chb - 1) // cha    else:        chx = chx - (pow(10, k - 1) - 1) // cha - 1    sch *= (chx % 1000000007)sys.stdout.write(str(sch % 1000000007))