word = input()current = "a"res = 0n_letters = ord("z") - ord("a") + 1for letter in word :    a = abs( ord(letter)-ord(current) )    if a < (n_letters // 2) :        res += a    else :        res += n_letters - a      current = letter    print(res)