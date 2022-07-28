get = input  

def solve():    l, q = list(map(int, get().split()))


string = get()
check1, check2 = False, False
for i in range(q):        a, b = list(map(int, get().split()))
if b - a + 1 == l:
    print("NO")        else:
    for
i in range(0, a - 1):
if string[i] == string[a - 1]:                    print("YES")
check1 = True
break
if check1 == False:                for
i in range(b, l):
if string[i] == string[b - 1]:                        print("YES")
check2 = True
break
if check1 == False and check2 == False:                print(
    "NO")             check1, check2 = False, False for i in range(int(get())):    solve()    
