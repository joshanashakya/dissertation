import math 

def list_str(l, char):    output_str = ""


for i in range(len(l) - 1):        output_str += str(l[i]) + char
output_str += str(l[len(l) - 1])
return output_str  

def str_list(s, char):    output_list = []


intermediate = ""
for i in range(len(s)):        if
s[i] != char: intermediate += s[i]
if i == len(s) - 1:
    output_list.append(int(intermediate))        else:
    if
intermediate: output_list.append(int(intermediate))
intermediate = ""
return output_list  

def merge_sort(l):    def


merge(l1, l2): i, j = 0, 0
output_list = []
while i < len(l1) and j < len(l2):            if
l1[i] > l2[j]: output_list.append(l1[i])
i += 1 else:                output_list.append(l2[j])
j += 1
if i == len(l1):
    output_list += l2[j:]        elif j == len(l2):
    output_list += l1[i:]
return output_list 

def sort(l):        if


len(l) < 2:
return l else:            mid = len(l) // 2
left = sort(l[:mid])
right = sort(l[mid:])
return merge(left, right)
return sort(l)  

def be_reversed(l):    def


recursion_part(l, start, end):
if start >= end:
    return l        else:
    l[start], l[end] = l[end], l[start]
return recursion_part(l, start + 1, end - 1)
return recursion_part(l, 0, len(l) - 1)  

def quicksort(l):    def


partition(l, start, end): i = start
ind_pivot = end
for j in range(start, end):            if
l[j] >= l[ind_pivot]: l[j], l[i] = l[i], l[j]
i += 1
l[ind_pivot], l[i] = l[i], l[ind_pivot]
return i  

def quick_sort(l, start, end):        if


len(l) < 2:
return l elif start < end: p = partition(l, start, end)
quick_sort(l, start, p - 1)
quick_sort(l, p + 1, end)
quick_sort(l, 0, len(l) - 1)
return l   # k = [ 2,4,3,2,1,2,3,4,5,6,5,4,3,2]# quicksort(k)# print(k)  def collector_recursive(l):    output_list = []    def colec(l, start, end, cl):        if start > end:            return cl        else:            cl.append(f"{l[start][1]} {l[end][1]}")            return colec(l, start + 1, end - 1, cl)    return colec(l, 0, len(l) - 1, output_list)  def find_min(l):    mini = l[0]    ind = 0    for i in range(len(l)):        if mini > l[i]:            mini = l[i]            ind = i    return ind     def main_function():    output_list  = []    test_cases = int(input())    for test_case in range(test_cases):        if test_case != test_cases - 1:            n, x = str_list(input(), " ")            a = str_list(input(), " ")            b = str_list(input(), " ")            k = input()        else:            n, x = str_list(input(), " ")            a = str_list(input(), " ")            b = str_list(input(), " ")        a = merge_sort(a)        b = quicksort(b)        b = be_reversed(b)        for i in range(len(a)):            if a[i] + b[i] > x:                ans = "NO"                break        else:            ans = "YES"        output_list.append(ans)    return list_str(output_list, "\n")  print(main_function())
