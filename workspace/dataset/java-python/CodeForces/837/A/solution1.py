n=input()S=list(map(str,input().split()))Max=0for i in range(len(S)):    C=0    for j in range(len(S[i])):       if S[i][j].isupper():           C+=1    if C>Max:        Max=Cprint(Max)
