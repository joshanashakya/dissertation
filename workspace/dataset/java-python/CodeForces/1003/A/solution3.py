# -*- coding: utf-8 -*-"""Created on Tue Mar 30 23:06:43 2021 @author: nagan""" n = int(input())s = input().split()l = [int(i) for i in s]c = 1for i in l:    if l.count(i) > c:        c = l.count(i)print(c)