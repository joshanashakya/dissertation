def string_list(s, char):    output_list = []


intermediator = ""
for i in range(len(s)):        if
s[i] != char: intermediator += s[i]
if i == len(s) - 1:
    output_list.append(int(intermediator))        else:
    if
intermediator: output_list.append(int(intermediator))
intermediator = ""
return output_list  

def list_string(l, char):    output_str = ""


for i in range(len(l) - 1):        output_str += str(l[i]) + char
output_str += str(l[len(l) - 1])
return output_str  

def merge_sort(l):    def


merge(l1, l2): i, j = 0, 0
output_list = []
while i < len(l1) and j < len(l2):            if
l1[i] < l2[j]: output_list.append(l1[i])
i += 1 else:                output_list.append(l2[j])
j += 1
if i == len(l1):
    output_list += (l2[j:])        else:
    output_list += (l1[i:])
return output_list 

def sorts(l):        if


len(l) < 2:
return l else:            mid = len(l) // 2
left = sorts(l[:mid])
right = sorts(l[mid:])
return merge(left, right)
return sorts(l)   

def main_function():    output_list = []


t = int(input())
for i in range(t):        n = int(input())
output_list.append(list_string([4 * n - i for i in range(2 * n) if not i % 2], " "))
return list_string(output_list, "\n")   print(main_function()) 
