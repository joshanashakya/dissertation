import sysfrom

array
import \
    array  # noqa: F401from itertools import permutations  def input():    return sys.stdin.buffer.readline().decode('utf-8')  notes = 'C C# D D# E F F# G G# A B H'.split()a = input().split()for x, y, z in permutations(a):    i, j, k = notes.index(x), notes.index(y), notes.index(z)    while i > j:        j += 12    while j > k:        k += 12    if i + 4 == j and j + 3 == k:        print('major')        exit()    if i + 3 == j and j + 4 == k:        print('minor')        exit()print('strange')
