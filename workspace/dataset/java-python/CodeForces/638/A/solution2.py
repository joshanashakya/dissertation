import sysn,a = map(int,input().split())up = [i for i in range(1,n,2)]down = [i for i in range(n,1,-2)]if a in up:    print(up.index(a)+1)else:    print(down.index(a)+1)
