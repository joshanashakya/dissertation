n = int(input())possible = Truefor _ in range(n):    s = list(str(input()))    for i in range(0, len(s)):        if i == 0:            if s[i] == '?':                if i+1 != len(s):                    s[i] = 'a' if s[i+1] != 'a' else 'b' if s[i+1] != 'b' else 'c'                else:                    s[i] = 'a'        elif i == len(s)-1 and s[i] == '?':            s[i] = 'a' if s[i-1] != 'a' else 'b' if s[i-1] != 'b' else 'c'        else:            if s[i] == s[i-1]:                possible = False                break            else:                if s[i] == '?':                    if s[i-1] == 'a':                        s[i] = 'b' if s[i+1] != 'b' else 'c'                    elif s[i-1] == 'b':                        s[i] = 'c' if s[i+1] != 'c' else 'a'                    else:                        s[i] = 'b' if s[i+1] != 'b' else 'a'    print("".join(map(str, s)) if possible else -1)    possible = True