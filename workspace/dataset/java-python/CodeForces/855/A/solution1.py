def main_function():    n = int(input())    names = []    output_list = []    dict = {}    for i in range(n):        names.append(input())    for name in names:        if not name in dict:            output_list.append("NO")            dict[name] = 1        else:            output_list.append("YES")    return "\n".join(output_list)  print(main_function())