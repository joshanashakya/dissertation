import sysimport math#import random#sys.setrecursionlimit(10000000)input = sys.stdin.readline ############ ---- USER DEFINED INPUT FUNCTIONS ---- ############def inp():    return(int(input()))def inara():    return(list(map(int,input().split())))def insr():    s = input()    return(list(s[:len(s) - 1]))def invr():    return(map(int,input().split()))############################################################################ ---- THE ACTUAL CODE STARTS BELOW ---- ############ w,h=invr() if w>h:	w,h=h,w ans=0 for i in range(1,w+1):	for j in range(1,h+1):		if w-2*i+1>0 and h-2*j+1>0:			ans+=(w-2*i+1)*(h-2*j+1)		print(ans) 	