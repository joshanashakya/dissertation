def yo(ma,mi,n,s):    main1 = n//ma    main2 = n//mi    flag = 0     for i in range(main1,-1,-1):        for j in range(0,main2+1):            #print(ma*i+mi*j)            if ma*i+mi*j == n:                flag = 1                break        if flag == 1:            break     main1 = i    main2 = j     if flag == 1:        print(main1+main2)        t = 0        for i in range(main1):            print(s[t:t+ma])            t+=ma            for i in range(main2):            print(s[t:t+mi])            t+=mi    else:        print(-1)        return "" n, p, q = map(int, input().split())s = input() ma = max(p,q)mi = min(p,q) print(yo(ma,mi,n,s))
