# collaborated with no one lettersString = "ACGT" lettersIndex = 0 numberOfLetters = int(input()) letters = list(input()) dictOfLetters = dict() i = 0 j = numberOfLetters - 1 dictOfLetters = {'A': 0, 'C': 0, 'G': 0, 'T': 0} while i <= j:    if letters[i] != '?':        dictOfLetters[letters[i]] += 1    if letters[j] != '?':        dictOfLetters[letters[j]] += 1     i += 1    j -= 1 maxNumberOfLetters = max(list(dictOfLetters.values())) if numberOfLetters % 4 != 0 or maxNumberOfLetters > numberOfLetters // 4:    print("===")elif maxNumberOfLetters == 0:    print(lettersString * (len(letters) // 4))else:    for index, letter in enumerate(letters):        if letter == '?':            while dictOfLetters[lettersString[lettersIndex]] >= numberOfLetters // 4:                if lettersIndex == 3:                    lettersIndex = 0                lettersIndex += 1             letters[index] = lettersString[lettersIndex]            dictOfLetters[lettersString[lettersIndex]] += 1     print("".join(letters))      	  			 	   	 				          	 	