import mathfrom

decimal
import Decimal  

def string_to_list(s, char):    collector = ""


output_list = []
for i in range(len(s)):        if
s[i] != char: collector += s[i]
if i == len(s) - 1:
    output_list.append(int(collector))        else:
    output_list.append(int(collector))
collector = ""
return output_list    # print(string_to_list("2 -1 -1", " "))  def list_to_string(l, char):    output_string = ""    for i in range(len(l) - 1):        output_string += str(l[i]) + char    output_string += str(l[-1])    return output_string  def quick_sort(l):    def partition(l, start, end):        pivot = l[end]        i = start        for j in range(start, end):            if l[j] <= pivot:                l[j], l[i] = l[i], l[j]                i += 1        l[end], l[i] = l[i], l[end]        return i     def recutrsion_part(l, start, end):        if len(l) < 2:            return l        elif not start >= end:            p = partition(l, start, end)            recutrsion_part(l, start, p - 1)            recutrsion_part(l, p + 1, end)     recutrsion_part(l, 0, len(l) - 1)    return l  def mergesort(l):    def merge(l_1, l_2):        output_list = []        i, j = 0, 0        while i < len(l_1) and j < len(l_2):            if l_1[i] < l_2[j]:                output_list.append(l_1[i])                i += 1            else:                output_list.append(l_2[j])                j += 1        if j == len(l_2):            output_list += l_1[i:]        else:            output_list.append(l_2[j:])        return output_list     def sorty(l):        if len(l) < 2:            return l        else:            mid = len(l) // 2            left = sorty(l[:mid])            rit = sorty(l[mid:])            return merge(left, rit)     return sorty(l)  def minimum(l):    minim = l[0]    for i in l:        if minim > i:            minim = i    return minim  def maximum(l):    maxim = l[0]    for i in l:        if maxim < i:            maxim = i    return maxim  def list_reverse(l):    def recursion(l, start, end):        if start >= end:            return l        else:            l[start], l[end] = l[end], l[start]            return recursion(l, start + 1, end - 1)     return recursion(l, 0, len(l) - 1)  def max_min(x, y):    if x > y:        return y, x    return x, y  def are_elements_equal(l):    intermediate = l[0]    for i in l:        if intermediate != i:            return False        intermediate = i    return True  def recursion_function(l):    if are_elements_equal(l):        return len(l)    else:        return 1  def is_divisible(n, c):    if n == 1:        return c    elif n % 5 == 0:        return is_divisible((4 * n) // 5, c + 1)    elif n % 3 == 0:        return is_divisible((2 * n) // 3, c + 1)    elif n % 2 == 0:        return is_divisible(n // 2, c + 1)    else:        return -1  def find_upper_bound(n):    i = 0    while 2 ** i <= n:        i += 1    return i - 1  def convert_to_binary(n):    cur = n    max_i = find_upper_bound(n)    binary = ""    for i in range(max_i + 1):        var = max_i - i        current = 2 ** var        if cur - 2 ** var >= 0:            cur = cur - 2 ** var            varib = 1        else:            varib = 0        binary += str(varib)    return binary  #print(convert_to_binary(4)) def find_x(str1, str2):    x = ""    l_1 = len(str1)    l_2 = len(str2)    if l_1 - l_2 > 0:        str2 = "0" * (l_1 - l_2) + str2    else:        str1 = "0" * (l_2 - l_1) + str1    for i in range(len(str1)):        if str1[i] == str2[i] and str1[i] == "1":            x += "1"        elif str1[i] == str2[i] and str1[i] == "0":            x += "0"        else:            x += "1"    return x  def xor_operation(str1, str2):    output_str = ""    l_1 = len(str1)    l_2 = len(str2)    if l_1 - l_2 > 0:        str2 = "0" * (l_1 - l_2) + str2    else:        str1 = "0" * (l_2 - l_1) + str1    for ind in range(len(str1)):        #ind = len(str1) - 1 - i        if str1[ind] != str2[ind]:            output_str += "1"        else:            output_str += "0"    return output_str #print(xor_operation("0110", "1110")) def convert_to_dec(string):    value = 0    for i in range(len(string)):        power = len(string) - 1 - i        value += int(string[i]) * (2 ** power)    return value  def main_function():    test_cases = range(int(input()))    output_list = []    for test_case in test_cases:        a, b = string_to_list(input(), " ")        #print(a, b, "1")        binary_b = convert_to_binary(b)        binary_a = convert_to_binary(a)        #print(binary_a, binary_b,"2")        binary_x = find_x(binary_a, binary_b)        #print(binary_x,"3")        binary_a_x = xor_operation(binary_x, binary_a)        #print(binary_a_x,"4")        binary_b_x = xor_operation(binary_x, binary_b)        #print(binary_b_x, "5")        dec_a_x = convert_to_dec(binary_a_x)        # print(dec_a_x, "6")        dec_b_x = convert_to_dec(binary_b_x)        #print(dec_b_x,"7")        output = dec_a_x + dec_b_x        output_list.append(output)    return list_to_string(output_list, "\n")  print(main_function())