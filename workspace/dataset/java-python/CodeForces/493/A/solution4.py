from math import * t1 = input()t2 = input() m1, m2 = {}, {}for i in range(int(input())):    t, time, n, cor = input().split()    n = int(n)        if (time == 'h' and (n not in m1 or m1[n] != 'r')) or (time == 'a' and (n not in m2 or m2[n] != 'r')):        if (time == 'h' and (n in m1 and m1[n] == 'y' or cor == 'r')) or (time == 'a' and (n in m2 and m2[n] == 'y' or cor == 'r')):            if time == "h":                m1[n] = 'r'            else:                m2[n] = 'r'            print((t1 if time == 'h' else t2), n, t)        else:            if time == "h":                m1[n] = 'y'            else:                m2[n] = 'y'
