n = int(input()) s = input() l = len(s)letters = set(s) all_letters = {'B', 'G', 'R'} if len(letters) == 3:    print(''.join(all_letters))elif len(letters) == 2:    if l == 2:        print(''.join(sorted(all_letters - letters)))    else:        a, b = letters        count_a = s.count(a)        count_b = s.count(b)        if count_a >= 2 and count_b >= 2:            print(''.join(all_letters))        elif count_a > count_b:            print(''.join(sorted((all_letters - letters).union(b))))        elif count_b > count_a:            print(''.join(sorted((all_letters - letters).union(a))))else:    print(''.join(letters))