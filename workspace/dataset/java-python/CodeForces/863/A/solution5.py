s=input()s=list(s)while s[-1]=='0':    s.pop()d=s[::-1]print("YES" if d==s else "NO")
