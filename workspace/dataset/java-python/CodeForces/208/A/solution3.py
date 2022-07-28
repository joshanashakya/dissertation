Str = input()NStr = Str.replace("WUB"," ")NStr1 = NStr.title()NStr2 = NStr1.replace(" ","") import reStr1 = re.sub('([A-Z])', r' \1', NStr2)Str2 = Str1[1:].upper()print(Str2)
