for _ in range(int(input())):    n = int(input())
a = [int(i) for i in input().split()]     hills_and_valleys = [0] * n
for ind in range(1, n - 1):        if
a[ind - 1] < a[ind] and a[ind + 1] < a[ind] or a[ind - 1] > a[ind] and a[ind + 1] > a[ind]: hills_and_valleys[
    ind] = 1     sum_of_hills_and_valleys = sum(hills_and_valleys)     if n >= 2:
    left_num_and_right_num = [[a[0], a[1]]]    else:
    left_num_and_right_num = [[a[0], a[0]]]     for ind in range(1, n - 1):        left_num_and_right_num.append(
    [a[ind - 1], a[ind + 1]])     if n >= 2:        left_num_and_right_num.append(
    [a[-2], a[-1]])     num_of_deleted_ones = 0
for ind in range(1, n - 1):        if
hills_and_valleys[ind - 1] == hills_and_valleys[ind] == hills_and_valleys[ind + 1] == 1: num_of_deleted_ones = 3
break elif hills_and_valleys[ind] == 1: ones = sum(hills_and_valleys[ind - 1:ind + 2])             if a[ind - 1] < a[
    ind + 1] > left_num_and_right_num[ind + 1][
    1] or \               a[ind - 1] > a[ind + 1] < left_num_and_right_num[ind + 1][1]:                num_of_deleted_ones = max(
    num_of_deleted_ones, ones - 1)            else:
    num_of_deleted_ones = max(num_of_deleted_ones, ones)             if left_num_and_right_num[ind - 1][0] < a[
    ind - 1] > a[
    ind + 1] or \               left_num_and_right_num[ind - 1][0] > a[ind - 1] < a[ind + 1]:                num_of_deleted_ones = max(
    num_of_deleted_ones, ones - 1)            else:
    num_of_deleted_ones = max(num_of_deleted_ones, ones)     print(sum_of_hills_and_valleys - num_of_deleted_ones)
