import sysimport bisectt,r=map(int,sys.stdin.readline().split())a,b=sorted([int(x) for x in sys.stdin.readline().split()]),[int(x) for x in sys.stdin.readline().split()]R=sorted(a)out=[]for x in b:    out.append(bisect.bisect(R,x))print(*out)