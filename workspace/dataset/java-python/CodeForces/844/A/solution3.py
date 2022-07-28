s = list(str(input()))k = int(input())r = 0possible = Trueif len(s) < k:    possible = Falseelse:    r = k - len(set(s))    r = 0 if r < 0 else rprint(r if possible else "impossible")
