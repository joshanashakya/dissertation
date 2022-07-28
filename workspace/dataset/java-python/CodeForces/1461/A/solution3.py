def str_list(s, char):    output_list = []


collector = ""
for i in range(len(s)):        if
s[i] == char:
if collector:                output_list.append(int(collector))
collector = "" else:            collector += s[i]
output_list.append(int(collector))
return output_list  

def merge_sort(l):    def


merge(l_1, l_2): i, j = 0, 0
output_list = []
while i < len(l_1) and j < len(l_2):            if
l_1[i][0] < l_2[j][0]: output_list.append(l_1[i])
i += 1 else:                output_list.append(l_2[j])
j += 1
if i == len(l_1):
    output_list += l_2[j:]        elif j == len(l_2):
    output_list += l_1[i:]
return output_list 

def sorts(l):        if


len(l) < 2:
return l else:            mid = len(l) // 2
left = sorts(l[:mid])
right = sorts(l[mid:])
return merge(left, right)
return sorts(l)  

def merge_sort2(l):    def


merge(l_1, l_2): i, j = 0, 0
output_list = []
while i < len(l_1) and j < len(l_2):            if
l_1[i][1] < l_2[j][1]: output_list.append(l_1[i])
i += 1 else:                output_list.append(l_2[j])
j += 1
if i == len(l_1):
    output_list += l_2[j:]        elif j == len(l_2):
    output_list += l_1[i:]
return output_list 

def sorts(l):        if


len(l) < 2:
return l else:            mid = len(l) // 2
left = sorts(l[:mid])
right = sorts(l[mid:])
return merge(left, right)
return sorts(l)   

def str_list_with_str(s, char):    output_list = []


collector = ""
for i in range(len(s)):        if
s[i] == char:
if collector:                output_list.append(collector)
collector = "" else:            collector += s[i]
output_list.append(collector)
return output_list 

def list_str(l, char):    output_str = ""


for i in range(len(l) - 1):        output_str += str(l[i]) + char
output_str += str(l[len(l) - 1])
return output_str 

def find_max(l, i, current_max):    if


i == len(l):
return current_max else:        if current_max < l[i]:            current_max = l[i]
return find_max(l, i + 1, current_max)  

def simple_find_min_max(l):    current_max = l[0]


current_min = l[0]
for i in l:        if
current_max < i: current_max = i
if current_min > i:            current_min = i
return current_min, current_max  

def simple_find_min(l):    current_max = l[0]


for i in l:        if
current_max > i: current_max = i
return current_max  

def sum(l):    sum = 0


for i in l:        sum += i
return sum  

def count_1_0(s, char):    count_1 = 0


for i in s:        if
i == char: count_1 += 1
return count_1  

def maxi(c1, c2):    if


c1 > c2:
return c1
return c2 

def mini(c1, c2):    if


c1 < c2:
return c1
return c2  

def find_power(n):    power = 0


while n >= 2 ** power:            power += 1
return power - 1  

def dec_to_binary(n):    output_str = ""


power = find_power(n)
for p in range(power + 1):        i = power - p
element = n // (2 ** i)
output_str += str(element)
n -= (2 ** i) * element
return output_str  

def binary_to_dec(string):    sum = 0


for i in range(len(string)):        current_power = len(string) - 1 - i
sum += 2 ** current_power * int(string[i])
return sum  

def or_operation(s1, s2):    if


len(s1) > len(s2): s2 = "0" * (len(s1) - len(s2)) + s2 elif len(s2) > len(s1): s1 = "0" * (len(s2) - len(s1)) + s1
output_str = ""
for i in range(len(s1)):        if
s1[i] == "1" or s2[i] == "1": output_str += "1" else:            output_str += "0"
return output_str  

def or_op_for_dec(n, m):    binary_n = dec_to_binary(n)


binary_m = dec_to_binary(m)
or_result = or_operation(binary_m, binary_m)
return binary_to_dec(or_result)     

def main_function():    test_cases = range(int(input()))


output_list = []
for test_case in test_cases:        n, k = str_list(input(), " ")
output_list_1 = []
for i in range(1, n + 1):            if
i % 3 == 1: output_list_1.append("a") elif i % 3 == 2: output_list_1.append(
    "b") else:                output_list_1.append("c")
output_list.append(list_str(output_list_1, ""))
return list_str(output_list, "\n")   print(main_function())
