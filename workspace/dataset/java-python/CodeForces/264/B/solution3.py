#!/usr/bin/env python3from sys import stdin mem = [0 for i in range(int(1e5+1))]  def solve(tc):    n = int(stdin.readline().strip())    seq = list(map(int, stdin.readline().split()))     if n==1:        print(1)        return     ans = 0    for i in range(n):        num = seq[i]         divisor = set()        p = 2        while p*p <= num:            while num % p == 0:                divisor.add(p)                num //= p            p += 1        if num > 1:            divisor.add(num)         for dn in divisor:            mem[seq[i]] = max(mem[seq[i]], mem[dn]+1)         for dn in divisor:            mem[dn] = mem[seq[i]]         ans = max(ans, mem[seq[i]])     print(ans)  tcs = 1for tc in range(tcs):    solve(tc)
