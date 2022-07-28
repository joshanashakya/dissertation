A = input().split()d = int(A[1])k = int(A[0]) if d == 0:    if k== 1:        print(0)    else:        print("No solution") else:    x = d*(10**(k-1))    print(x)
