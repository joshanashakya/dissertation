def string_to_list(s, char):    collector = ""


output_list = []
for i in range(len(s)):        if
s[i] != char: collector += s[i]
if i == len(s) - 1:
    output_list.append(int(collector))        else:
    output_list.append(int(collector))
collector = ""
return output_list  

def list_to_string(l, char):    output_string = ""


for i in range(len(l) - 1):        output_string += str(l[i]) + char
output_string += str(l[-1])
return output_string  

def quick_sort(l):    def


partition(l, start, end): pivot = l[end]
i = start
for j in range(start, end):            if
l[j] <= pivot: l[j], l[i] = l[i], l[j]
i += 1
l[end], l[i] = l[i], l[end]
return i 

def recutrsion_part(l, start, end):        if


len(l) < 2:
return l elif not start >= end: p = partition(l, start, end)
recutrsion_part(l, start, p - 1)
recutrsion_part(l, p + 1, end)
recutrsion_part(l, 0, len(l) - 1)
return l    # print(quick_sort([2,3,4,3,2,1,2,3,4,5,6,5,4,3,2]))   def list_reverse(l):    def recursion(l, start, end):        if start >= end:            return l        else:            l[start], l[end] = l[end], l[start]            return recursion(l, start + 1, end - 1)    return recursion(l, 0, len(l) - 1)  def divisibility(n):    sum  = 0    for i in n:        sum += int(i)    return not sum % 4  def recursive_solution(x):    while not divisibility(x):        x = str(int(x) + 1)    return x  def which_is_higher(l):    if l[1] < l[0]:        l[0], l[1] = l[1], l[0]    return l     def main_function():    test_cases = int(input())    output_list = []    for test_case in range(test_cases):        l = which_is_higher(string_to_list(input(), " "))        if l[1] == l[0]:            moves = l[0] + l[1]        else:            moves = 2 * l[1] - 1        output_list.append(moves)    return list_to_string(output_list, "\n")  print(main_function())
