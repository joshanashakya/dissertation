def string_to_list(s, char):    collector = ""    output_list = []    for i in range(len(s)):        if s[i] != char:            collector += s[i]            if i == len(s) - 1:                output_list.append(int(collector))        else:            output_list.append(int(collector))            collector = ""    return output_list  def list_to_string(l, char):    output_string = ""    for i in range(len(l) - 1):        output_string += str(l[i]) + char    output_string += str(l[-1])    return output_string  def merge_sort(l):    def merge(l1, l2):        output_list = []        i, j = 0, 0        while i < len(l1) and j < len(l2):            if l1[i] < l2[j]:                output_list.append(l1[i])                i +=1            else:                output_list.append(l2[j])                j += 1        if i == len(l1):            output_list += l2[j:]        else:            output_list += l1[i:]        return output_list      def recursion_part(l):        if len(l) < 2:            return l        else:            mid = len(l) // 2            left = recursion_part(l[:mid])            right = recursion_part(l[mid:])            return merge(left, right)    return recursion_part(l)  def list_reverse(l):    def recursion(l, start, end):        if start >= end:            return l        else:            l[start], l[end] = l[end], l[start]            return recursion(l, start + 1, end - 1)    return recursion(l, 0, len(l) - 1)  def divisibility(n):    sum  = 0    for i in n:        sum += int(i)    return not sum % 4  def recursive_solution(x):    if divisibility(x):        return int(x)    else:        return recursive_solution(str(int(x) + 1))  def main_function():    inp = input()    return recursive_solution(inp)            print(main_function())