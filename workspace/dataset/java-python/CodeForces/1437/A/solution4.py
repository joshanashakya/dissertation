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

def main_function():    output_list = []


test_cases = range(int(input()))
for test_case in test_cases:        l, r = str_list(input(), " ")
if r // l < 2:
    answer = "YES"        else:
    answer = "NO"
output_list.append(answer)
return list_str(output_list, "\n")  print(main_function())
