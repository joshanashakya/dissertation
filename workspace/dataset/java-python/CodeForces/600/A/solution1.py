import re  def is_int(s:  str) -> bool:    if len(s) > 0 and (s[0] == "0" and len(s) > 1):        return False    else:        try:            int(s)            return True        except:            return False  def partition(pred, iterable):    trues = []    falses = []    for item in iterable:        if pred(item):            trues.append(item)        else:            falses.append(item)    return trues, falses  def print_ans(s):    if len(s) > 0:        print("\"{}\"".format(",".join(s)))    else:        print("-")  s = re.split(";|,", input())s_int, s_str = partition(is_int, s)print_ans(s_int)print_ans(s_str)