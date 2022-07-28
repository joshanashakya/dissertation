s = input()ans = ""if len(s)==1:    print(1)else:    ans+=str(int(s[0])+1)    for i in range(1,len(s)):        ans+="0"    print(int(ans)-int(s))
