def I(): return list(map(int, input().split()))  n, k = I()sequence_number = I()count = 0if sequence_number[0] > 0 and k % 2 == 1:    print(sum(sequence_number) - sequence_number[0] * 2)    exit()elif sequence_number[0] > 0 and k % 2 == 0:    print(sum(sequence_number))    exit()else:    for i in range(k):        if sequence_number[i] < 0:            sequence_number[i] = -sequence_number[i]        else:            count = i            break        if i == n - 1:            count = n            breaksequence_number.sort()if count != 0:    if (k - count) % 2 == 0:        print(sum(sequence_number))        exit()    else:        print(sum(sequence_number) - sequence_number[0] * 2)        exit()print(sum(sequence_number))