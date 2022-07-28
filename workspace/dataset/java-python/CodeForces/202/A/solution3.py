def palindromic_subseq(word):    largest_char = sorted(word)[-1]     return largest_char * (word.count(largest_char)) word = input()print(palindromic_subseq(word))
