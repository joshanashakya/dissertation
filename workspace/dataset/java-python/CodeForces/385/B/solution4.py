s = input()sm = 0n=len(s)temp=-1for i in range(n-3):        if s[i]=='b' and s[i+1]=='e' and s[i+2]=='a' and s[i+3]=='r':                sm+= (i-temp)*(n-3-i)                temp=iprint(sm)
