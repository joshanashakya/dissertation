#!/usr/bin/env python3# -*- coding: utf-8 -*-"""Created on Wed Dec 30 15:22:04 2020 @author: yash""" #      _       _       _                     _         _     _                 #     | | __ _(_)  ___| |__  _ __ ___  ___  | | ___ __(_)___| |__  _ __   __ _ #  _  | |/ _` | | / __| '_ \| '__/ _ \/ _ \ | |/ / '__| / __| '_ \| '_ \ / _` |# | |_| | (_| | | \__ \ | | | | |  __/  __/ |   <| |  | \__ \ | | | | | | (_| |#  \___/ \__,_|_| |___/_| |_|_|  \___|\___| |_|\_\_|  |_|___/_| |_|_| |_|\__,_| """# Codeforces Round #163 (Div. 2), problem: (B) Queue at the School,                                                                                    n, t = map(int, input().split())        p = input()        s = list(p)        for i in range(t):            j = 0            while j < len(s)-1:                if s[j] == 'G':                    j += 1                elif s[j] != s[j+1]:                    s[j], s[j+1] = s[j+1], s[j]                    j += 2                else:                    j += 1        print(''.join(s))        # B G G B G# G B G G B # B G G B G --> G B G G B --> G G B G B""" """# contest: Codeforces Round #197 (Div. 2), problem: (B) Xenia and Ringroad     Case - 1:       4 3       3 2 3            1->3 : 1->2->3       3->2 : 3->4->1->2       2->3 : 2->3                 n, m = map(int, input().split())    initial_pos = 1    ans = 0    x = list(map(int, input().split()))    for i in x:        ans += ((i-initial_pos+n)%n)        initial_pos = i    print(ans)""" """# Codeforces Round #267 (Div. 2), problem: (B) Fedor and New Game    n,m,k = map(int,input().split())    a = []    cnt = 0         for i in range(0,m):        x = int(input())        a.append(x)    f = int(input())         for i in range(0,m):        if bin(a[i]^f).count('1') <= k:            cnt += 1         print(cnt)""" """# Codeforces Round #273 (Div. 2), problem: (B) Random Teams    n,m=map(int,input().split())    a=n//m    max_pairs = (n-m+1)*(n-m)//2    min_pairs = m*a*(a-1)//2 + a*(n%m)    print(min_pairs ,max_pairs)""" """ # Codeforces Round #258 (Div. 2), problem: (B) Sort the Array        n = int(input())        l = list(map(int, input().split()))        startIdx = 0        endIdx = 0        i = 0        while i < len(l)-1:            if l[i] > l[i+1]:                startIdx = i+1                j = i                while j < len(l) - 1 and l[j] > l[j+1]:                    j+=1                endIdx = j+1                i += j            i+=1                temp = list(l)        x = startIdx        y = endIdx        while startIdx < endIdx:            temp[startIdx-1], temp[endIdx-1] = temp[endIdx-1], temp[startIdx-1]            startIdx += 1            endIdx -= 1        if x != y:               l.sort()            if temp == l:                print("yes")                print(x, y)            else:                print("no")        else:            print("yes")            print(1, 1)""""""# Codeforces Round #284 (Div. 2), problem: (B) Lecture        n, m = map(int, input().split())        dic = {}        for i in range(m):            x, y = map(str, input().split())            if len(x) < len(y):                dic[y]=x            elif len(x) > len(y):                dic[x]=y            else:                dic[y]=x        content = input()        l = list(content.split(" "))        ans = ''        for i in l:            try:                if len(i) > len(dic[i]):                    ans += dic[i]                    ans += ' '                else:                    ans += i                    ans += ' '            except:                ans += i                ans += ' '                 print(ans)                    OR                         n, m = map(int, input().split())        d = {}                 for i in range(m):          a, b = input().split()          d[a] = b if len(b) < len(a) else a                 for i in input().split():          print(d[i], end = " ")                                  OR(My solution optimal version)                              n, m = map(int, input().split())        dic = {}        ans = ''        for i in range(m):            x, y = map(str, input().split())            if len(x) > len(y):                dic[x]=y            else:                dic[x]=x        for i in input().split():            ans += dic[i]            ans += ' '                print(ans)         """   # def SieveOfEratosthenes(n, k):#     prime = [True for i in range(n+1)]#     p = 2#     while(p*p <= n):#         if prime[p] == True:#             for i in range(p*p, n+1, p):#                 prime[i] = False#         p += 1    #     for p in range(2, n+1):#         if prime[p] and p*p <= k and p*p == k:#             return "YES"#     return "NO"                # n = int(input())# l = list(map(int, input().split()))# for i in l:#     print(SieveOfEratosthenes(n, i))    """ # Codeforces Round #288 (Div. 2), problem: (B) Anton and currency you all know    n = input()    l = list(n)                  # 4 3 8 2 5    index = float("-inf")    for i in range(len(l)):        if int(l[i])%2 == 0:            if l[-1] < l[i]:                index = max(index, i)            else:                index = i                 break                    if index != float("-inf"):        l[index],l[-1]=l[-1],l[index]        print(''.join(l))    else:        print(-1) """   """ # Codeforces Round #FF (Div. 2), problem: (B) DZY Loves Strings        s = input()        k = int(input())         l = list(map(int, input().split()))        dic = {}        max_val = max(l)        count = 0        for i in 'abcdefghijklmnopqrstuvwxyz':            dic[i] = l[count]            count += 1        ans = 0        for i in range(len(s)):            j = i+1            ans = ans + j*dic[s[i]]                i = len(s)+1        while i < len(s)+1+k:            ans = ans + i*max_val            i += 1        print(ans)                  OR                   s = input()        k = int(input())         l = list(map(int, input().split()))        max_val = max(l)        count = 0        ans = 0        for i in range(len(s)):            j = i+1            ans = ans + j*l[ord(s[i])-ord('a')]             i = len(s)+1        while i < len(s)+1+k:            ans = ans + i*max_val            i += 1        print(ans)"""  """# Codeforces Round #287 (Div. 2), problem: (B) Amr and Pins        import math        r, x1, y1, x2, y2 = map(int, input().split())        Distance = math.sqrt((x2-x1)**2 + (y2-y1)**2)        ans = math.ceil(Distance/(2*r))        print(ans)""""""# Codeforces Round #259 (Div. 2), problem: (B) Little Pony and Sort by Shift        def solve():            n = int(input())            l = list(map(int, input().split()))            flag = True            ans = True            pos = 0            val = 0            if n == 2 and l[0] < l[1]:                return 0            if len(set(l)) == 1:                return 0            for i in range(len(l)-1):                if flag:                    if l[i] > l[i+1]:                        flag = False                        pos = i+1                else:                    if l[i] > l[i+1]:                        ans = False                        if l[0]<l[-1]:  #3 4 1 2 3 5                ans = False            if not flag and ans:                val = n-pos                return val            else:                return -1                print(solve())    # 4 5 1 2 3# 3 4 5 1 2  step - 1# 2 3 4 5 1  step - 2# 1 2 3 4 5  step - 3 """  """# Given: x,y# f1 = x# f2 = y# fi = f(i-1) + f(i+1)# To find f3? --> f2 = f1 + f3# ------------ # f3 = f2 - f1 = y-x# f4 = f3 - f2 = y - x - y = -x# f5 = f4 - f3 = -x - y + x = -y# f6 = f5 - f4 = -y - (-x) = x-y# f7 = f6 - f5 = x - y -  (-y) = x# f8 = f7 - f6 = x - x + y = y x, y = map(int, input().split())n = int(input())l = [x-y, x, y, y-x, -x, -y]print(l[n%6]%1000000007)"""  """n = int(input())l = []for i in range(n):    val = int(input())           l.append(val)ans = n + (n-1)ans += l[0]for i in range(1, len(l)):    ans += abs(l[i]-l[i-1])print(ans)""""""n, s, t = map(int, input().split())l = list(map(int, input().split()))for i in range(n):    if s == t:        print(i)        exit()    s = l[s-1]print(-1)"""  """# Codeforces Round #256 (Div. 2), problem: (B) Suffix Structuress = input()t = input() sorted_s = sorted(s)sorted_t = sorted(t)def subset(t, s):    i = 0    for char in s:        if(char == t[i]):            i += 1        if(i == len(t)):            break    return i == len(t)    if sorted_t == sorted_s:    print("array")elif subset(t,s):    print("automaton")elif subset(sorted_t, sorted_s):    print("both")else:    print("need tree") """     # array = []# for i in range(3):#     row = list(map(int, input().split()))#     array.append(row)# array[0][0] = 99999# row_sum = sum(array[0])# for i in range(1, 3):#     for j in range(3):#         if i == j:#             array[i][j] = row_sum - sum(array[i]) # for i in range(3):#     print(*array[i])   # import math# for _ in range(int(input())):#     n, x = map(int, input().split())#     l = list(map(int, input().split()))#     minimum = 0#     maximum = 0#     min_ = sum(l)//x#     max_tre = False#     for i in range(len(l)):#         if l[i]%x != 0:#             max_tre = True#         maximum += math.ceil(l[i]/x)#     if max_tre:#         print(min_, maximum)#     else:#         print(maximum, min_)         # for _ in range(int(input())):#     n, x = map(int, input().split())#     l = list(map(int, input().split()))#     ans = 0#     for i in range(len(l)):#         if l[i]%x == 0:#             l.append(l[i]//x)#             ans += ((x-1)*(l[i]//x))#         else:#             ans += l[i]            #     print(ans)            # 2 2 4  # # 2 2 4 1 2   1 2       """x 3 65 y 54 7 z x + y + z = x + 3 + 6        y + z = 9  -----(1)10 + y = 11 + zy - z = 1 ------(2)Adding (1) and (2), we get-->2y = 10y = 5z = 4x = 6 --------------- z = arr[0][1] + arr[0][2] - yarr[1][0] + y + arr[1][2] = arr[2][0] + arr[2][1] + zarr[1][0] + y + arr[1][2] = arr[2][0] + arr[2][1] + arr[0][1] + arr[0][2] - y2y = arr[2][0] + arr[2][1] + arr[0][1] + arr[0][2] - arr[1][0] - arr[1][2]y = (arr[2][0] + arr[2][1] + arr[0][1] + arr[0][2] - arr[1][0] - arr[1][2])/2z = arr[1][0] + arr[1][2] - arr[2][0] -  arr[2][1] + yx = arr[2][0] + arr[2][1] + z - arr[0][1] - arr[0][2] """"""arr = []for _ in range(3):    l = list(map(int, input().split()))    arr.append(l)    y = 0x = 0z = 0y = (arr[2][0] + arr[2][1] + arr[0][1] + arr[0][2] - arr[1][0] - arr[1][2])//2z = arr[1][0] + arr[1][2] - arr[2][0] -  arr[2][1] + yx = arr[2][0] + arr[2][1] + z - arr[0][1] - arr[0][2] arr[0][0] = xarr[1][1] = yarr[2][2] = z for i in range(3):    print(*arr[i]) """"""# Codeforces Round #212 (Div. 2), problem: (B) Petya and Staircases    def solve(l, n, m):   # 2 3 4 5 6 7 8 9 10        l.sort()        count = 1        for i in range(1, m):            if l[i] - l[i-1] == 1:                count += 1            else:                count = 1            if count > 2:                return "NO"        return "YES"                   n, m = map(int, input().split())    if m > 0:        l = list(map(int, input().split()))    if m == 0:        print("YES")        elif (1 in l) or (n in l):        print("NO")    else:        print(solve(l, n, m))"""  """# Codeforces Round #171 (Div. 2), problem: (B) Books    n, t = map(int, input().split())    book_time = list(map(int, input().split()))    sum_ = 0    count = 0     for i in range(n):        sum_ += book_time[i]        if sum_ > t:            sum_ -= book_time[count]            count += 1    print(n-count) """ """ # Codeforces Round #289 (Div. 2, ACM ICPC Rules), problem: (B) Painting Pebbles# 4 4        # 1 2 3 4# Condition - |bi, c - bj, c| ≤ 1# sol ->  1#         1 1#         1 1 2#         1 1 3 4 n, k = map(int, input().split())l = list(map(int, input().split()))min_ = min(l)max_ = max(l)if (max_ - min_ - k) <= 0:    print("YES")    for i in range(n):        kk = 1        j = 0        while j < l[i]:            if (j<= min_):                print(1, end = " ")            else:                kk += 1                print(kk, end = " ")            j += 1        print()else:    print("NO")"""""" # Codeforces Round #281 (Div. 2), problem: (B) Vasya and Wrestling, n = int(input())player1 = []player2 = []sum_1 = 0sum_2 = 0last_el = 0for i in range(n):    move = int(input())    if i == n-1:        last_el = move    if move >= 0 :        sum_1 += move        player1.append(move)    else:        move *= -1        sum_2 += move        player2.append(move) if sum_1 > sum_2:    print("first")elif sum_1 < sum_2:    print("second")else:    if player1 > player2:        print("first")    elif player1 < player2:        print("second")    else:        if last_el > 0:            print("first")        else:            print("second")         """"""n, m = map(int, input().split())List = lambda : list(map(int, input().split()))a = List()b = List()i, j = 0, 0while i < n and j < m:    if a[i] <= b[j]:        i += 1    j += 1print(max(0, n-i))"""# import math# for _ in range(int(input())):#     n,m,a,b = map(int, input().split())#     sum_ = 0#     for i in range(n):#     	sum_ += math.floor((a*i+b)/m)#     print(sum_)  """# Codeforces Round #213 (Div. 2), problem: (B) The Fibonacci Segmentn = int(input())arr = list(map(int, input().split()))arr_2 = [2 for x in range(n)]if n == 1:    print(1)else:    ans = 2    for i in range(2, n):        if arr[i] == arr[i-1]+arr[i-2]:            arr_2[i] = arr_2[i-1] + 1            ans = max(ans, arr_2[i])        print(ans)"""  """# Codeforces Round #110 (Div. 2), problem: (B) Trace      n = int(input())l = list(map(int, input().split()))l.sort()sums = 0for i in range(n):    if i % 2 == 0:        sums += l[i]**2    else:        sums -= l[i]**2ans = sums*3.1415926536print(abs(ans))"""  """# Codeforces Beta Round #34 (Div. 2), problem: (B) Sale, n, m = map(int, input().split())l = list(map(int, input().split()))l.sort()sums = 0for i in range(m):    if l[i]<=0:        sums += l[i]    else:        break print(abs(sums))""" """# Codeforces Beta Round #87 (Div. 2 Only), problem: (B) Little Pigs and Wolvesn, m = map(int, input().split())array = []                                     #2 3ans = 0                                        #WPW                     for _ in range(n):                             #P.P                                           s = input()    array.append(s) for i in range(n):    for j in range(m):        if(array[i][j] == "W"):            if (i-1 >= 0 and array[i-1][j] == "P"):                ans += 1                continue            if (i+1 < n and array[i+1][j] == "P"):                ans += 1                continue            if (j-1>=0 and array[i][j-1] == "P"):                ans += 1                continue            if (j+1<m and array[i][j+1] == "P"):                ans += 1                continueprint(ans)""""""d, sumTime = map(int, input().split())mini_sum = 0max_sum = 0array = []for _ in range(d):    mini, maxi = map(int, input().split())    array.append([mini, maxi])    mini_sum += mini    max_sum += maxiif (mini_sum > sumTime or max_sum < sumTime):    print("NO")else:    print("YES")    sumTime -= mini_sum    for i in range(d):        print(array[i][0] + min(sumTime, array[i][1]-array[i][0]), end=" ")        sumTime -= min(sumTime, array[i][1]-array[i][0])    print()""" """for _ in range(int(input())):    def gcd(a,b):        if a == 0:            return b        return gcd(b % a, a)     def lcm(a,b):        return (a / gcd(a,b))* b        s = input()    t = input()    len_s = len(s)    len_t = len(t)    Lcm = int(lcm(len_s, len_t))    if (Lcm//len_s)*s == (Lcm//len_t)*t:        print((Lcm//len_s)*s)    else:        print(-1)    """ """# Codeforces Beta Round #91 (Div. 2 Only), problem: (B) Lucky Substrings = input()c1 = 0c2 = 0for i in s:    if i == '4':        c1 += 1    elif i == '7':        c2  += 1if c1 > c2 or c1 == c2 and c1 != 0:    print('4')elif c2 > c1:    print('7')else:    print('-1')""""""n = int(input())arr = []counter = 1points = 0for _ in range(n):    a, b = map(int, input().split())    if b != 0:        counter += b-1        points += a    else:        arr.append([a,b])arr.sort(key=lambda x:x)for i in reversed(range(len(arr))):    if counter > 0:        points += arr[i][0]        counter -= 1        counter += arr[i][1]print(points)"""    """# Codeforces Beta Round #54 (Div. 2), problem: (B) Coinsn = int(input())for i in reversed(range(n+1)):    if i > 0:        if n % i == 0:            print(i, end =" ")            n = i """"""# Codeforces Round #239 (Div. 2), problem: (B) Garland,Codeforces Round #239 (Div. 2), problem: (B) Garland,def solve():    s = input()    t = input()    s_map = {}    t_map = {}    for i in s:        if i not in s_map:            s_map[i] = 0        s_map[i] += 1    for i in t:        if i not in t_map:            t_map[i] = 0        t_map[i] += 1    ans = 0    for i in t:        if i not in s:            print(-1)            return 0    else:        for i in s_map.keys():            if i in t_map:                if s_map[i] >= t_map[i]:                    ans += t_map[i]                else:                    ans += s_map[i]    print(ans)    solve() """ """# Codeforces Beta Round #84 (Div. 2 Only), problem: (B) Lucky Stringn = int(input())ans = ""temp = "abcd"for i in range(n):    ans += temp[i%4]   print(ans)"""  # n = int(input())# heights = list(map(int, input().split()))# ans = 0# step = 1# for i in range(n):#     for j in range(i+1, n):#         if heights[i] > heights[j]:#             ans += abs(heights[j]-heights[i])*step#             step = 1#             break#         elif heights[j] < heights[i]:#             ans += abs(heights[i]-heights[j])*step#             step = 1#             break#         else:#             step += 1# print(ans)                                      # n, m = map(int, input().split())# if n % m  == 0:#     for i in range(3):#         if i == 0:#             print("1 "*m, end = "")#         elif i == 1:#             print("2 "*m, end = "")#         else:#             print("3 "*m, end = "")# else:#     temp = n - m#     print("1 2 3", end = " ")#     for i in range(temp):#         print(['3','2','1', ][i%3], end = " ")   # 1 2 3 1 2 2 3 3 1         # def waterArea(heights):#     maxes = [0 for x in heights]#     leftMax = 0#     for i in range(len(heights)):#         height = heights[i]#         maxes[i] = leftMax#         leftMax = max(leftMax, height)#     rightMax = 0#     for i in reversed(range(len(heights))):#         height = heights[i]#         minHeight = min(rightMax, maxes[i])#         if height < minHeight:#             maxes[i] = minHeight - height#         else:#             maxes[i] = 0#         rightMax = max(rightMax, height)#     return sum(maxes)  # print(waterArea([1,2,1,2,1]))    # n = int(input())# l = list(map(int, input().split())) """# Codeforces Round #145 (Div. 2, ACM-ICPC Rules), problem: (B) Readingfi=open('input.txt','r')n, k = map(int, fi.readline().split())a_hours = list(map(int, fi.readline().split())) temp = sorted(a_hours)startIdx = abs(n-k)first_hour = temp[startIdx]ans = []result = []for _ in range(startIdx, n):    ans.append(temp[_])for _ in range(n):    if a_hours[_] in ans:        result.append(_+1)        ans.remove(a_hours[_])w=open('output.txt','w')print(first_hour, file=w)print(*result, file=w) """names = []taxi = []pizza = []call = []for _ in range(int(input())):    n, s = map(str, input().split())    names.append(s)    taxi_num = 0    pizza_num = 0    call_num = 0    for i in range(int(n)):        num = input().replace('-', '')        if len(set(num)) == 1:            taxi_num += 1        else:            for j in range(len(num)-1):                if num[j] <= num[j+1]:                    call_num += 1                    break            else:                pizza_num += 1    taxi.append(taxi_num)    pizza.append(pizza_num)    call.append(call_num) # [0, 2, 0, 0, 0]# [2, 0, 1, 1, 1]# [0, 0, 0, 0, 1] # print(names)# print(taxi)# print(pizza)# print(call)max_taxi = max(taxi)max_pizza = max(pizza)max_call = max(call) ta = "If you want to call a taxi, you should call: "for i in range(len(taxi)):    if taxi[i] == max_taxi:        ta += names[i] + ', 'print(ta[:-2]+'.') pi = "If you want to order a pizza, you should call: "for i in range(len(pizza)):    if pizza[i] == max_pizza:        pi += names[i] + ', 'print(pi[:-2]+'.')  ca = "If you want to go to a cafe with a wonderful girl, you should call: "for i in range(len(call)):    if call[i] == max_call:        ca += names[i] + ', ' print(ca[:-2]+'.')  # s = input()# temp = "aeiou"# non_vowels = ""# vowels = ""# for i in s:#     if i in temp:#         vowels += i#     else:#         non_vowels += i # S = sorted(vowels)# for i in S:#     print(i)# for i in non_vowels:#     print(i)                                   
