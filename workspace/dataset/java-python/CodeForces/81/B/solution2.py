# вводим строку ss, i, v = input() + ' ', 0, ' ' # перебираем строкуwhile i < len(s):    # если в строке запятая, поставить пробел после нее    if s[i] == ',':        v += ', '    # если в строке точки, заменить их на многоточия и пробел перед ними    elif s[i] == '.':        v += ('' if v[-1] == ' ' else ' ') + '...'        i += 2    # проверка строки на наличие цифр    elif s[i].isdigit():        j = i        # ставим пробел перед числом        while s[j].isdigit():            j += 1        v += (' ' if v[-1].isdigit() else '') + s[i:j]        i = j - 1    i += 1print(v.strip())