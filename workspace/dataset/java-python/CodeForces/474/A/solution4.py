keyboard = [["q", "w", "e", "r","t", "y", "u", "i", "o","p"], ["a","s","d","f","g","h","j","k","l",";"], ["z","x","c","v","b","n","m",",",".","/"]] offset = input()sentence = input()correct_sentence = ""for i in sentence:    if(keyboard[0].count(i) != 0):        if(offset.upper() == "R"):            correct_sentence = correct_sentence + keyboard[0][keyboard[0].index(i)-1]        else:            correct_sentence = correct_sentence + keyboard[0][keyboard[0].index(i)+1]     if(keyboard[1].count(i) != 0):        if(offset.upper() == "R"):            correct_sentence = correct_sentence + keyboard[1][keyboard[1].index(i)-1]        else:            correct_sentence = correct_sentence + keyboard[1][keyboard[1].index(i)+1]        if(keyboard[2].count(i) != 0):        if(offset.upper() == "R"):            correct_sentence = correct_sentence + keyboard[2][keyboard[2].index(i)-1]        else:            correct_sentence = correct_sentence + keyboard[2][keyboard[2].index(i)+1] print(correct_sentence)