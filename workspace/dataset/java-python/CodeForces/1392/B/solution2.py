def str_list(s, char):
    output_list = []
    collector = ""
    for i in range(len(s)):
        if s[i] == char:
            if collector:
                output_list.append(int(collector))
                collector = ""
        else:
            collector += s[i]
    output_list.append(int(collector))
    return output_list


def merge_sort(l):
    def merge(l_1, l_2):
        i, j = 0, 0
        output_list = []
        while i < len(l_1) and j < len(l_2):
            if l_1[i] < l_2[j]:
                output_list.append(l_1[i])
                i += 1
            else:
                output_list.append(l_2[j])
                j += 1
        if i == len(l_1):
            output_list += l_2[j:]
        elif j == len(l_2):
            output_list += l_1[i:]
        return output_list

    def sorts(l):
        if len(l) < 2:
            return l
        else:
            mid = len(l) // 2
            left = sorts(l[:mid])
            right = sorts(l[mid:])
        return merge(left, right)

    return sorts(l)


def str_list_with_str(s, char):
    output_list = []
    collector = ""
    for i in range(len(s)):
        if s[i] == char:
            if collector:
                output_list.append(collector)
                collector = ""
        else:
            collector += s[i]
    output_list.append(collector)
    return output_list


def list_str(l, char):
    output_str = ""
    for i in range(len(l) - 1):
        output_str += str(l[i]) + char
    output_str += str(l[len(l) - 1])
    return output_str


def find_max(l, i, current_max):
    if i == len(l):
        return current_max
    else:
        if current_max < l[i]:
            current_max = l[i]
        return find_max(l, i + 1, current_max)


def simple_find_min_max(l):
    current_max = l[0]
    current_min = l[0]
    for i in l:
        if current_max < i:
            current_max = i
        if current_min > i:
            current_min = i
    return current_min, current_max


def simple_find_min(l):
    current_max = l[0]
    for i in l:
        if current_max > i:
            current_max = i
    return current_max


def solve_recursively(l):
    pass


def main_function():
    test_cases = range(int(input()))
    output_list = []
    for test_case in test_cases:
        n, k = str_list_with_str(input(), " ")
        k = int(str(k)[-1])
        l = str_list(input(), " ")
        the_lowest, the_largest = simple_find_min_max(l)
        if not k % 2:
            output_list.append(list_str([i - the_lowest for i in l], " "))
        else:
            if len(l) == 1:
                output_list.append(list_str([0], " "))
            else:
                output_list.append(list_str([the_largest - i for i in l], " "))
    return list_str(output_list, "\n")

    #     string = list_str(sorted_l, " ")
    #     output_list.append(string)
    # return list_str(output_list, "\n")


print(main_function())
