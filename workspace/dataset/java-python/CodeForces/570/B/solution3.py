import sys#import bisectimport mathimport itertoolsdef get_line(): return list(map(int, sys.stdin.readline().strip().split()))def in1(): return int(input()) n,k=get_line()if n==1 and k==1:    print(1)else:    if n%2!=0:        t1 = n // 2 + 1        if t1==k:            print(k-1)        elif k<t1:            print(k+1)        else:            print(k-1)    else:        t1=n//2        if k==t1:            print(k+1)        elif k>t1:            print(k-1)        else:            print(k+1)     