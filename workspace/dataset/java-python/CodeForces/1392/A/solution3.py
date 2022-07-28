def string_to_list(s, char):
    collector = ""
    output_list = []
    for i in range(len(s)):
        if s[i] != char:
            collector += s[i]
            if i == len(s) - 1:
                output_list.append(int(collector))
        else:
            output_list.append(int(collector))
            collector = ""
    return output_list


# print(string_to_list("2 -1 -1", " "))


def list_to_string(l, char):
    output_string = ""
    for i in range(len(l) - 1):
        output_string += str(l[i]) + char
    output_string += str(l[-1])
    return output_string


def quick_sort(l):
    def partition(l, start, end):
        pivot = l[end]
        i = start
        for j in range(start, end):
            if l[j] <= pivot:
                l[j], l[i] = l[i], l[j]
                i += 1
        l[end], l[i] = l[i], l[end]
        return i

    def recutrsion_part(l, start, end):
        if len(l) < 2:
            return l
        elif not start >= end:
            p = partition(l, start, end)
            recutrsion_part(l, start, p - 1)
            recutrsion_part(l, p + 1, end)

    recutrsion_part(l, 0, len(l) - 1)
    return l


def mergesort(l):
    def merge(l_1, l_2):
        output_list = []
        i, j = 0, 0
        while i < len(l_1) and j < len(l_2):
            if l_1[i] < l_2[j]:
                output_list.append(l_1[i])
                i += 1
            else:
                output_list.append(l_2[j])
                j += 1
        if j == len(l_2):
            output_list += l_1[i:]
        else:
            output_list.append(l_2[j:])
        return output_list

    def sorty(l):
        if len(l) < 2:
            return l
        else:
            mid = len(l) // 2
            left = sorty(l[:mid])
            rit = sorty(l[mid:])
            return merge(left, rit)

    return sorty(l)


def minimum(l):
    minim = l[0]
    for i in l:
        if minim > i:
            minim = i
    return minim


def maximum(l):
    maxim = l[0]
    for i in l:
        if maxim < i:
            maxim = i
    return maxim


def list_reverse(l):
    def recursion(l, start, end):
        if start >= end:
            return l
        else:
            l[start], l[end] = l[end], l[start]
            return recursion(l, start + 1, end - 1)

    return recursion(l, 0, len(l) - 1)


def max_min(x, y):
    if x > y:
        return y, x
    return x, y


def are_elements_equal(l):
    intermediate = l[0]
    for i in l:
        if intermediate != i:
            return False
        intermediate = i
    return True


def recursion_function(l):
    if are_elements_equal(l):
        return len(l)
    else:
        return 1


def main_function():
    test_cases = range(int(input()))
    output_list = []
    for test_case in test_cases:
        n = int(input())
        l = string_to_list(input(), " ")
        x = recursion_function(l)
        output_list.append(x)
    return list_to_string(output_list, "\n")


print(main_function())
