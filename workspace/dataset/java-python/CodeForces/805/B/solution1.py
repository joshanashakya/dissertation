length = int(input()) st = "a"string_len = 1 while True:         st = st+ "bbaabbaabbaabbaabbaabb"     st =st + "aabbaabbaabbaabbaabbaa"     string_len += 44    if(string_len > length):        break    print(st[:length])
