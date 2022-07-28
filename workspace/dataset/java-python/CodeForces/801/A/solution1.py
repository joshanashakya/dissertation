s=input()a=[s.count('VK')]for i in range(len(s)):    if s[i]=='V':        x=s[:i]+'K'+s[i+1:]    elif s[i]=='K':        x=s[:i]+'V'+s[i+1:]    a.append(x.count('VK'))print(max(a))
