import sysdef input():    return sys.stdin.readline().strip()def iinput():   return int(input())def minput():   return map(int, input().split()) def listinput(): return list(map(int, input().split()))l,r,x,y,k=minput()answer="NO"for i in range(x,y+1):    if l<=i*k<=r:        answer="YES"        breakprint(answer)