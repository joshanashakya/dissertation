s = input()
s = sorted(s)
count = 1
ans = []
for i in range(1, len(s)):
    if (s[i] == s[i - 1]):
        count += 1
    else:
        ans.append(count)
        count = 1
ans.append(count)
ans.sort()
if (len(ans) == 1):
    print(1)
if (len(ans) == 2):
    if (ans[0] == 1):
        print(1)
    else:
        print(2)
if (len(ans) == 3):
    if (len(set(ans)) == 1):
        print(6)
    elif (ans == [1, 1, 4]):
        print(2)
    elif (ans == [1, 2, 3]):
        print(3)
if (len(ans) == 4):
    if (ans == [1, 1, 1, 3]):
        print(5)
    elif (ans == [1, 1, 2, 2]):
        print(8)
if (len(ans) == 6):
    print(30)
if (len(ans) == 5):
    print(15)
