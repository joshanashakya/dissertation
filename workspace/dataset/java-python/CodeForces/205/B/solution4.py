from sys import stdin ,stdoutfrom os import pathrd = lambda:stdin.readline().strip()wr = stdout.writeif(path.exists('input.txt')):    stdin = open("input.txt","r")import time #------------------------------------x = int(rd())mylist = list(map(int,rd().split()))ans = sum(max(0,mylist[i-1]-mylist[i]) for i in range(1,x))print(ans)
