# coding: utf-8 n = int(input())s = input()toSanFrancisco = toSeattle = 0 for i in range(1, n):  if s[i] != s[i - 1]:    if s[i] == 'S':      toSeattle += 1          else:      toSanFrancisco += 1      print('YES') if toSanFrancisco > toSeattle else print('NO')