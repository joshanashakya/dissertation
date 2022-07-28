#!/usr/bin/env python# -*- coding: utf-8 -*- """Codeforces Problem 1311A. Add Odd or Subtract Even :author:         Kitchen Tong:mail:    kctong529@gmail.com Please feel free to contact me if you have any questionregarding the implementation below.""" __version__ = '0.1'__date__ = '2021-04-07'  import sys  def solve(a, b) -> int:    # add odd -> change parity, increase value    # subtract even -> parity unchanged, decrease value    if a == b:        return 0    if a % 2 == b % 2:        if a > b:            return 1    # subtract even once        else:            return 2    # add odd twice    else:        if a < b:            return 1    # add odd once        else:            return 2    # add odd once and subtract even once    return -1  def main(argv=None):    t = int(input())    for _ in range(t):        a, b = map(int, input().split())        print(solve(a, b))    return 0  if __name__ == "__main__":    STATUS = main()    sys.exit(STATUS)