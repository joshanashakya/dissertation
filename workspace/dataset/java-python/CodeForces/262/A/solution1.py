def insertion_sort(l):    for i in range(len(l)):        for j in (range(i)):            k = i - j            if l[k] >= l[k - 1]:                l[k - 1], l[k] = l[k], l[k - 1]            else:                break    return l   def selection_sort(l):    for i in range(len(l)):        min_ind = i        min_val = l[i]        for j in range(i, len(l)):            if min_val > l[j]:                min_val = l[j]                min_ind = j        l[i], l[min_ind] = l[min_ind], l[i]    return l  def bubble_sort(l):    for i in range(len(l) - 1):        for j in range(len(l) - 1 - i):            if l[j] > l[j + 1]:                l[j], l[j + 1] = l[j + 1], l[j]    return l  # l = [5,4,3,2,6,1,3,5,6,7,8,9,0,9,8,7,6,7,8,9,8,7,1,6,4,8,32]# print(insertion_sort(l)) def is_even_list(l):    for i in l:        if i % 2:            return False    return True  def main_function():    #t = int(input())    output_list = []    n, k = [int(i) for i in input().split(" ")]    l = [i for i in input().split(" ")]    count_top_level = 0    for i in l:        count_low_level = 0        for j in i:            if j == "7" or j == "4":                count_low_level += 1        if count_low_level <= k:            count_top_level += 1    return count_top_level   print(main_function())