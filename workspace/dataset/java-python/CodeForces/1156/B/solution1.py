n = int(input())arr = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]for i in range(n):    corrs = sorted(input())    evon = []    odon = []    for j in range(len(corrs)):        if arr.index(corrs[j]) % 2 == 0:            evon.append(corrs[j])        else:            odon.append(corrs[j])    if len(evon) == 0:        ans = ""        for j in range(len(odon)):            ans += odon[j]        print(ans)    elif len(odon) == 0:        ans = ""        for j in range(len(evon)):            ans += evon[j]        print(ans)    else:        if abs(arr.index(evon[-1])-arr.index(odon[0])) != 1:            ans = ""            for j in range(len(evon)):                ans += evon[j]            for j in range(len(odon)):                ans += odon[j]            print(ans)        elif abs(arr.index(evon[0])-arr.index(odon[-1])) != 1:            ans = ""            for j in range(len(odon)):                ans += odon[j]            for j in range(len(evon)):                ans += evon[j]            print(ans)        else:            print("No answer")
