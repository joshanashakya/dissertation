s = list(input())i=0count=0while i<len(s)-1:    if s[i]==s[i+1]:        s.pop(i)        s.pop(i)        count+=1        if i>0:            i-=1    else:        i+=1print("YES" if count %2==1 else "NO")    