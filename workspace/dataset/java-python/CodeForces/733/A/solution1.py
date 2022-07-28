s = input()s = 'A' + s + 'A'vo  = "AEIOUY"pos = [i+1 for i , j in enumerate(s) if j in vo]   pos = [0] + posarr = [j-i for i , j in zip(pos[:-1] , pos[1:])]print(max(arr))
