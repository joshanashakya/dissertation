d = input()ad = ''if d[:4] == 'http':    ad += 'http://'else:    ad += 'ftp://'ad += d[(len(ad) - 3):(d.rfind('ru'))] + '.ru'if len(ad) != len(d) + 4:    ad += '/' + d[(d.rfind('ru') + 2):]print(ad)
