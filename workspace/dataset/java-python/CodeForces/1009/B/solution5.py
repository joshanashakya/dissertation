s = input() if len(set(s)) == 1:    print(s)else:    noOnes = ""     oneCount = 0     for i in range(len(s)):        if s[i] == '1':            oneCount += 1        else:            noOnes += s[i]     for i in range(len(noOnes)):        if noOnes[i] == '2':            noOnes = noOnes[:i] + '1' * oneCount + noOnes[i:]            break        if i == len(noOnes) - 1:            noOnes = noOnes + '1' * oneCount                print(noOnes)
