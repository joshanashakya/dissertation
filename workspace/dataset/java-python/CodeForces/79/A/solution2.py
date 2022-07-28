state = 1
x, y = map(int, input().split()) while True:    state = 1 - state
if state == 0:        if
x >= 2 and y >= 2: x -= 2
y -= 2
continue elif x >= 1 and y >= 12: x -= 1
y -= 12
continue elif x >= 0 and y >= 22: x -= 0
y -= 22
continue else:            break elif state == 1:
if x >= 0 and y >= 22:            x -= 0
y -= 22
continue elif x >= 1 and y >= 12: x -= 1
y -= 12
continue elif x >= 2 and y >= 2: x -= 2
y -= 2
continue else:            break  print(['Hanako', 'Ciel'][state])  
