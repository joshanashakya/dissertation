def get_crop(n, m, waste, i, j):    curr = (m * i) + j


if curr in waste:        return "Waste"
new = curr
i = 0
while i < len(waste) and waste[i] < curr:        new -= 1
i += 1
if new % 3 == 0:
    return "Carrots"    elif new % 3 == 1:
    return "Kiwis"    else:
    return "Grapes"  s = input().split()
n, m, k, t = int(s[0]), int(s[1]), int(s[2]), int(s[3])
waste = []
for i in range(k):    s = input().split()
waste.append((m * (int(s[0]) - 1)) + int(s[
                                             1]) - 1)  # chuj cos innego niz count sort siema  def partition_Lomuto(tab, l, r):    pivot = tab[r]    j = l    for i in range(l, r):        if tab[i] < pivot:            tab[i], tab[j] = tab[j], tab[i]            j += 1    tab[r], tab[j] = tab[j], tab[r]    return j  def quickSort(tab, l, r):    if l < r:        q = partition_Lomuto(tab, l, r)        quickSort(tab, l, q-1)        quickSort(tab, q+1, r)  quickSort(waste, 0, len(waste)-1)# noi co by uzyc tufor i in range(t):    s = input().split()    print(get_crop(n, m, waste, int(s[0])-1, int(s[1])-1))
