#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Apr  4 18:13:28 2021

@author: suneelvarma
"""


def answer(st, k):
    ss, es = st.find('*'), st.rfind('*')
    count = 1
    i = ss

    while i < es:
        if st[i] == '*': count += 1
        nextStar = min(len(st) - 1, i + k)
        while st[nextStar] != '*': nextStar -= 1
        i = nextStar

    return count


if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, k = tuple(map(int, input().split()))
        st = input()
        print(answer(st, k))
