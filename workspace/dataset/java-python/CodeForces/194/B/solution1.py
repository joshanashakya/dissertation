from sys import stdin ,stdoutfrom os import pathrd = lambda:stdin.readline().strip()wr = stdout.writeif(path.exists('input.txt')):    stdin = open("input.txt","r")import time #------------------------------------x = int(rd())mylist = list(map(int,rd().split()))for i in mylist:	print( 1+i*( 1 if i % 4 == 3 else 2 if i % 2 == 1 else 4))