n, m, k = map(int, input().split())   celles = list(list(input().replace(".", "X")) for i in range(n))k = n*m - k - sum(i.count("#") for i in celles)i, p = 0, [] while k:    if "X" in celles[i]:        j = celles[i].index("X")        celles[i][j], p = ".", [[i, j]]        k -= 1        break    i += 1 while k:    x, y = p.pop()    for i, j in ((x-1,y),(x+1,y),(x,y-1),(x,y+1)):        if n > i >= 0 and m > j >= 0 and celles[i][j] == "X":            celles[i][j] = "."            p.append([i, j])            k -= 1            if k == 0: break    print("\n".join("".join(celles[i]) for i in range(n)))
