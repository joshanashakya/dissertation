import mathimport syssys.setrecursionlimit(1500) def list_str(l, char):    output_str = ""    for i in range(len(l) - 1):        output_str += str(l[i]) + char    output_str += str(l[len(l) - 1])    return output_str  def str_list(s, char):    output_list  = []    intermediate  = ""    for i in range(len(s)):        if s[i] != char:            intermediate += s[i]            if i == len(s) - 1:                output_list.append(int(intermediate))        else:            if intermediate:                output_list.append(int(intermediate))                intermediate = ""    return output_list  def merge_sort(l):    def merge(l1, l2):        i, j = 0, 0        output_list = []        while i < len(l1) and j < len(l2):            if l1[i] < l2[j]:                output_list.append(l1[i])                i += 1            else:                output_list.append(l2[j])                j += 1        if i == len(l1):            output_list += l2[j:]        elif j == len(l2):            output_list += l1[i:]        return output_list     def sort(l):        if len(l) < 2:            return l        else:            mid = len(l) // 2            left = sort(l[:mid])            right = sort(l[mid:])            return merge(left, right)    return sort(l)  def be_reversed(l):    def recursion_part(l, start, end):        if start >= end:            return l        else:            l[start], l[end] = l[end], l[start]            return recursion_part(l, start + 1, end - 1)    return recursion_part(l, 0, len(l) - 1)  def quicksort(l):    def partition(l, start, end):        i = start        ind_pivot = end        for j in range(start, end):            if l[j] >= l[ind_pivot]:                l[j], l[i] = l[i], l[j]                i += 1        l[ind_pivot], l[i] = l[i], l[ind_pivot]        return i      def quick_sort(l, start, end):        if len(l) < 2:            return l        elif start < end:            p = partition(l, start, end)            quick_sort(l, start, p - 1)            quick_sort(l, p + 1, end)    quick_sort(l, 0, len(l) - 1)    return l  def is_traingle(a, b, c):    if a + b > c and a + c > b and b + c > a:        return True    return False   def recursive_solution(a, b, c, m):    pass  def main_function():    output_list = []    #test_cases = range(int(input()))    #for test_case in test_cases:    a, b, c = str_list(input(), " ")    # a + b > c    # a + c > b    # b + c > a    if is_traingle(a, b, c):        return 0    else:        a, b, c = merge_sort([a, b, c])        dif = c - b - a + 1        return dif           #return list_str(output_list, "\n")  print(main_function())