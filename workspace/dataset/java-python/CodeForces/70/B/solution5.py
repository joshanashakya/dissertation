import sysn = int(input())
s = str(input())
m = len(s)
cnt = 0
gd = Falseans = 0l
st = 0
end = ['.', '?', '!']
rem = 0
for i in range(m):    cnt += 1
if (s[i] in end):        gd = True
lst = cnt  # store the last good one    if(cnt == n):        if(not gd):            print("Impossible")            exit(0)        else:            cnt = cnt - lst - 1            gd = False            ans += 1            rem = iif(s[m - 1] not in end):    print("Impossible")    exit(0)elif(rem != (m - 1)):    ans += 1print(ans)
