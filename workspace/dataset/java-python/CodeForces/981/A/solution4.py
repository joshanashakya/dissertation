s=input()if(s!=s[::-1]):    print(len(s))    exit(0)p=s[0]*len(s)if p==s:    print(0);    exit(0)print(len(s)-1)        
