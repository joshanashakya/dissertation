def str_list(s, char):    output_list = []    collector = ""    for i in range(len(s)):        if s[i] == char:            if collector:                output_list.append(int(collector))                collector = ""        else:            collector += s[i]    output_list.append(int(collector))    return output_list  def list_str(l, char):    output_str = ""    for i in range(len(l) - 1):        output_str += str(l[i]) + char    output_str += str(l[len(l) - 1])    return output_str  def main_function():    n_1, n_2, k_1, k_2 = str_list(input(), " ")    ratio_1 = n_1 // k_1    ratio_2 = n_2 // k_2    if n_1 > n_2:        return "First"    else:        return "Second"  print(main_function()) 