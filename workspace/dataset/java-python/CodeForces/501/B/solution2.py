n = int(input())old_names = []new_names = []records = {}count = 0for i in range(n):    name1, name2 = input().split()    old_names.append(name1)    new_names.append(name2) for i in range(n):    if old_names[i] not in records:        records[new_names[i]] = old_names[i]    elif old_names[i] in records:        records[new_names[i]] = records[old_names[i]]        del records[old_names[i]]print(len(records))for key in records:    root_names = records[key]    print(root_names + " " + key)  
