n = int(input())s = input() A = 0I = 0for i in range(n):    if s[i] == 'A':        A += 1    elif s[i] == 'I':        I += 1 if I > 1:    print(0)elif I == 1:    print(1)else:    print(A)
