def insertion_sort(l):    for


i in range(len(l)):
for j in (range(i)):            k = i - j
if l[k] >= l[k - 1]:
    l[k - 1], l[k] = l[k], l[k - 1]            else:
    break
return l   

def selection_sort(l):    for


i in range(len(l)): min_ind = i
min_val = l[i]
for j in range(i, len(l)):            if
min_val > l[j]: min_val = l[j]
min_ind = j
l[i], l[min_ind] = l[min_ind], l[i]
return l  

def bubble_sort(l):    for


i in range(len(l) - 1):
for j in range(len(l) - 1 - i):            if
l[j] > l[j + 1]: l[j], l[j + 1] = l[j + 1], l[j]
return l    # l = [5,4,3,2,6,1,3,5,6,7,8,9,0,9,8,7,6,7,8,9,8,7,1,6,4,8,32]# print(insertion_sort(l)) def is_even_list(l):    for i in l:        if i % 2:            return False    return True  def main_function():    t = int(input())    output_list = []    for i in range(t):        n = int(input())        a = [int(i) for i in input().split(" ")]        b = []        for i in range(len(a)):            if not i % 2:                a[i], a[i + 1] = a[i +1], a[i]        for i in range(len(a)):            if not i % 2:                b.append(str(-a[i]))            else:                b.append(str(a[i]))        output_list.append(" ".join(b))    return "\n".join(output_list)     print(main_function())
