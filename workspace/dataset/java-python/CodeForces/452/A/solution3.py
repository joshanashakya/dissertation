n=int(input())s=str(input())l=["vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"]for e in l:    if len(e) == len(s) and all(s[i] == '.' or s[i] == e[i] for i in range(n)):        print(e)        exit()
