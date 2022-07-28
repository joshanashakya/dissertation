a = input().split(', ')a[0] = a[0][1::]a[len(a)-1] = a[len(a)-1][:-1:]if a[0]!='':    print(len(set(a)))else: print(0)
