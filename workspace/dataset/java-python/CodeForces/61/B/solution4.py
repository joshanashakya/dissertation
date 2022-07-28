import sysinput = sys.stdin.readline  

def insr():    s = input()


return list(s[:len(s) - 1])  

def fixStr(s):    s = list(s)


signs = ['-', ';', '_']
i = 0
while i < len(s):        if
s[i] in signs: s.pop(i) else:            s[i] = s[i].lower()
i += 1
return ''.join(s)  words = [fixStr(insr()), fixStr(insr()), fixStr(insr())]
for i in range(int(input())):    sts = fixStr(insr()) if sts == words[0] + words[1] + words[2] or sts == words[0] +
                                                         words[2] + words[1] or sts == words[1] + words[0] + words[
                                                             2] or \            sts == words[1] + words[2] + words[
    0] or sts == words[2] + words[0] + words[1] or \            sts == words[2] + words[1] + words[0]: print(
    "ACC") else:        print("WA")
