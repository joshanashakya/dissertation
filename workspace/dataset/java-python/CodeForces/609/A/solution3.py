def insertion_sort(l):    for i in range(len(l)):        for j in (range(i)):            k = i - j            if l[k] >= l[k - 1]:                l[k - 1], l[k] = l[k], l[k - 1]            else:                break    return l   def selection_sort(l):    for i in range(len(l)):        min_ind = i        min_val = l[i]        for j in range(i, len(l)):            if min_val > l[j]:                min_val = l[j]                min_ind = j        l[i], l[min_ind] = l[min_ind], l[i]    return l  def bubble_sort(l):    for i in range(len(l) - 1):        for j in range(len(l) - 1 - i):            if l[j] > l[j + 1]:                l[j], l[j + 1] = l[j + 1], l[j]    return l  # l = [5,4,3,2,6,1,3,5,6,7,8,9,0,9,8,7,6,7,8,9,8,7,1,6,4,8,32]# print(insertion_sort(l))   def main_function():    n = int(input())    m = int(input())    a = []    for i in range(n):        a_i = int(input())        a.append(a_i)    sorted_a = insertion_sort(a)    sum = 0    count = 0    for i in a:        if sum >= m:            return count        else:            sum += i            count += 1    return count     print(main_function())
