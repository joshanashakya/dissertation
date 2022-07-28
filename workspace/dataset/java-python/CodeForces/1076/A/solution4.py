n = int(input())st = input()for i in range(n - 1):    if st[i] > st[i + 1]:        st = st[:i] + st[i + 1:]        breakif len(st) != n:    print(st)else:    print(st[:-1])
