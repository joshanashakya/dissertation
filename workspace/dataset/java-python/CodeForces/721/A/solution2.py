# coding: utf-8 n = int(input())s = input()groups = list()size = 0 for i in range(n):  if s[i] == 'B':    size += 1      else:    if size > 0:      groups.append(size)          size = 0 if size > 0:  groups.append(size) print(len(groups))print(*groups, sep = ' ')