import re s = input()s = (re.split(";|,",s))a = []b = []for i in s:    if (i.isalnum() and i.isdigit() == False):        b.append(i)    elif(i.isascii() and i.isdigit()==False):        b.append(i)    else:        if (i.isdigit()):            if (len(i) > 1):                if (i[0] != "0"):                    a.append(i)                else:                    b.append(i)            else:                a.append(i) if(len(a)>0):    a = ",".join(a)    print('"{}"'.format(a))else:    print("-")if(len(b)>0):    b = ",".join(b)    print('"{}"'.format(b))else:    print("-")
