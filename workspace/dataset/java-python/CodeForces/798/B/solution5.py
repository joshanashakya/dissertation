n = int(input())arr = []mi = 100000def get_next(word):    return word[1:len(word)]+word[0]def other(cur_word):    total = 0    for i in range(1, n):        flag = 0        mw = arr[i]        for j in range(len(mw)):            if(mw==cur_word):                flag = 1                break            total+=1            mw = get_next(mw)        if(flag == 0):            return -1    return total    for i in range(n):    arr.append(input())cur_word = arr[0]for i in range(len(arr[0])):    res = i+other(cur_word)    mi = min(res, mi)    cur_word = get_next(cur_word)print(mi)
