t = int(input(""))x = [int(n) for n in input('').split(' ')[:t]]ans = ['NO','YES'] for n in x: print(ans[int(n%14 != 0 and n%14 < 7 and n > 14)])
