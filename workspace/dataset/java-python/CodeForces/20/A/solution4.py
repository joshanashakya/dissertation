s=input().strip()x=[1] for i in s:     if i!='/':        x.append(i)    else:        if x[-1]!=i:            x.append(i)if x[-1]=='/' and len(x)>2:    print(''.join(x[1:len(x)-1]))else:    print(''.join(x[1:]))