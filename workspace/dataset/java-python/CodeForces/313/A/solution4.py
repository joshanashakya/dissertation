n=int(input())if n<0:    print(max(int(str(n)[:-1]), int(str(n)[:-2]+str(n)[-1])))else:    print(n)
