n = int(input())lucky = [4,7,47,74,447,474,477,774,747,744]count = 0for i in range(len(lucky)):    if ((n == lucky[i]) or (n%lucky[i]==0)):        print('YES')        break    else:        count+=1if count==10:    print('NO')
