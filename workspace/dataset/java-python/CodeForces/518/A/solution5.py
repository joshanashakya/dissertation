s=input()t=input()n=len(s)ans=""f=0d=0i=0while(i<n):    val1=1    if(s[i]==t[i]):        ans+=s[i]    else:        if(f==0):            f=1            if ord(t[i])-ord(s[i])>1:                val=ord(s[i])                val+=1                d=1                ans+=chr(val)            else:                val1=1                ans+=s[i]                for j in range(i+1,n):                    if(s[j]!='z'):                        d=1                        val = ord(s[j])                        val += 1                        ans += chr(val)                        val1+=1                        break                    else:                        ans+=t[j]                    val1+=1                if(d==0):                    ans=ans[:i]                    val1 = 1                    ans += t[i]                    for j in range(i + 1, n):                        if (t[j] != 'a'):                            d = 1                            ans+='a'                            val1 += 1                            break                        else:                            ans += t[j]                        val1 += 1        else:            ans+=s[i]    i+=val1if(d==0):    print("No such string")else:    print(ans)
