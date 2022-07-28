from itertools import permutationsnotes = ['C', 'C#', 'D', 'D#', 'E', 'F', 'F#', 'G', 'G#', 'A', 'B', 'H']
notes += notesdef
getDist(a, b):
for i in range(len(notes)):        if
notes[i] == a:
for j in range(i + 1, len(notes)):                if
notes[j] == b:
return j - idef
isMajor(a, b, c):
if getDist(a, b) == 4 and getDist(b, c) == 3:        return True
return Falsedef
isMinor(a, b, c):
if getDist(a, b) == 3 and getDist(b, c) == 4:        return True
return Falsex, y, z = input().split()
x, y, z = sorted(list([x, y, z]))
p = list(permutations([x, y, z]))
for perm in p:    a, b, c = perm
if isMajor(a, b, c):        print('major')
exit() elif isMinor(a, b, c): print('minor')
exit() print('strange')
