# cook your dish here #from math import factorial, ceil, powfrom sys import stdin, stdoutfrom collections import defaultdict, Counter, deque#from bisect import bisect_left, bisect_right#import sympy#import numpy as np #           int(stdin.readline())           stdout.write(str())#           stdin.readline()#           map(int, stdin.readline().split())#           list(map(int, stdin.readline().split()))#  n = int(stdin.readline())l = list(map(int, stdin.readline().split()))k = list(set(l))if len(k)==1:    print(0)else:    k.sort()    if len(k)==2:        if (k[1] - k[0]) % 2==0:            print((k[1] - k[0])//2)        else:            print(k[1] - k[0])    elif len(k)==3:        if k[1]-k[0] == k[2] - k[1]:            print(k[1]-k[0])        else:            print(-1)    else:        print(-1)