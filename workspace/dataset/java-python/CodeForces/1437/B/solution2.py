t = int(input())
for i in range(t):    l = int(input())
st = input()
st1 = "01"
st2 = "10"
for j in range(2, l, 2):        st1 = st1 + "01"
st2 = st2 + "10"
d1 = 0
flg = 0
for k in range(l):        if
    (flg == 1 and st[k] == st1[k]): d1 = d1 + 1
flg = 0 elif (st[k] != st1[k]): flg = 1
if (flg == 1):        d1 = d1 + 1
flg = 0
d2 = 0
for m in range(l):        if
    (flg == 1 and st[m] == st2[m]): d2 = d2 + 1
flg = 0 elif (st[m] != st2[m]): flg = 1
if (flg == 1):        d2 = d2 + 1
print(min(d1, d2))
