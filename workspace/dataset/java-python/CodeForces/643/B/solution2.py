import sysprint = sys.stdout.writen, k = map(int, input().split())a, b, c, d = map(int, input().split())if n == 4 or k < n+1:    print("-1\n")    exit()E = (a, b, c, d)print(f"{a} {c} ")for i in range(1, n+1):    if i not in E:        print(f"{i} ")print(f"{d} {b}\n")print(f"{c} {a} ")for i in range(1, n+1):    if i not in E:        print(f"{i} ")print(f"{b} {d}\n")
