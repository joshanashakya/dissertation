str1=list(map(str,input().split()))if(str1[len(str1)-1]=='?'):    k=str1[len(str1)-2]    k_len=len(k)    m=k[k_len-1]    if(m=='a' or m=='e' or m=='i' or m=='o' or m=='u'  or m=='y' or m=='A' or m=='E' or m=='I' or m=='O' or m=='U' or m=='Y'):        print('YES')    else:        print('NO')else:    k=str1[len(str1)-1]    k_len=len(k)    m=k[k_len-2]    if(m=='a' or m=='e' or m=='i' or m=='o' or m=='u'  or m=='y' or m=='A' or m=='E' or m=='I' or m=='O' or m=='U' or m=='Y'):        print('YES')    else:        print('NO')