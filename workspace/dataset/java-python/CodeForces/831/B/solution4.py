# cook your dish here first = list(input())second = list(input())string = list(input())new = "" for each in string:    if(each.isalpha()):        if(each.isupper()):            temp = first.index(each.lower())             new += second[temp].upper()                    else:            temp = first.index(each)             new += second[temp]                else:        new += each         print(new)
