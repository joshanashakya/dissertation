s1 = input()s2 = input()n = int(input()) good_words = set(s1)s3_list = []for _ in range(n):    s3 = input()    s3_list.append(s3) for s3 in s3_list:    flag = 1    if "*" not in s2:         if len(s2) != len(s3):            flag = 0        else:            for index,value in enumerate(s2):                if value == "?":                    if s3[index] not in good_words:                        flag = 0                        break                else:                    if s3[index] != s2[index]:                        flag = 0                        break        else:        if len(s3) < len(s2)-1:            flag = 0        else:            idx = s2.index("*")            s2_1 = s2[:idx]            s2_2 = s2[idx+1:]            #check from head            for index,value in enumerate(s2_1):                if value == "?":                    if s3[index] not in good_words:                        flag = 0                        break                else:                    if s3[index] != s2_1[index]:                        flag = 0                        break            #check from tail            s3_2 = s3[::-1][:len(s2_2)][::-1]            for index,value in enumerate(s2_2):                if value == "?":                    if s3_2[index] not in good_words:                        flag = 0                        break                else:                    if s3_2[index] != s2_2[index]:                        flag = 0                        break            #check medium            s3_1 = s3[:len(s2_1)]            s3_m = s3[len(s3_1):len(s3)-len(s3_2)]            if s3_m != "":                for word in s3_m:                    if word in good_words:                        flag = 0                        break    print("YES") if flag == 1 else print("NO")
