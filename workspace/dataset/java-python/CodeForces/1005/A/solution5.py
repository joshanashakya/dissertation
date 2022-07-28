input()a=input().split()l=[x for x,y in zip(a,a[1:]+['1'])if'1'==y]print(len(l))print(*l)
