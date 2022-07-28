t = int(input())
otv = list()
while (t != 0):    t -= 1
konf = int(input())
cpisok_konf = list()
cpisok_konf = list(map(int, input().split()))
sum_konf = sum(cpisok_konf)
if (sum_konf % 2 == 0 and cpisok_konf.count(1) >= 2):        otv.append("YES")
continue
if (sum_konf % 2 == 0 and konf % 2 == 0):
    otv.append("YES")    else:
    otv.append("NO") for i in otv:    print(i)
