n=int(input())L=["+------------------------+",   "|#.#.#.#.#.#.#.#.#.#.#.|D|)",   "|#.#.#.#.#.#.#.#.#.#.#.|.|",   "|#.......................|",   "|#.#.#.#.#.#.#.#.#.#.#.|.|)",   "+------------------------+"]l = []for y in L:    ans = []    for x in y:        ans.append(x)    l.append(ans)L = lfor i in range(1,len(L[0])) :    for j in range(len(L)) :        if L[j][i]=="#" and n>0 :            n-=1            L[j][i]="O"for x in L :    print("".join(x))
