import string n = int(input()) l = 0 

def get_next_l(exclusions=[]):    global l

     a = string.ascii_lowercase[l]
while a in exclusions:        l = (l + 1) % 26
a = string.ascii_lowercase[l]
l = (l + 1) % 26     return a rows = [[""] * n for _ in range(4)] if n == 1:    rows[0][0] = rows[1][0] = get_next_l()
rows[2][0] = rows[3][0] = get_next_l()  elif n == 2:
for i in range(4):        rows[i] = get_next_l() * 2  elif n % 2 == 0:
for i in range(0, n, 2):        rows[0][i] = rows[0][i + 1] = get_next_l()     front = get_next_l(rows[0][0]) 
rows[1][0] = front
for i in range(1, n - 1, 2):        rows[1][i] = rows[1][i + 1] = get_next_l(
    [rows[2][i - 1]] + rows[1][i:i + 2])     end = get_next_l(rows[0][-1] + rows[1][-2])     rows[1][-1] = end 
rows[2][0] = front
for i in range(1, n - 1, 2):        rows[2][i] = rows[2][i + 1] = get_next_l(
    [rows[2][i - 1]] + rows[1][i:i + 2] + [end])
rows[2][-1] = end     for i in range(0, n, 2):        rows[3][i] = rows[3][i + 1] = get_next_l(
    [rows[3][i - 1]] + rows[2][i:i + 2])  else:    for i in range(0, n - 1, 2):        rows[0][i] = rows[0][
    i + 1] = get_next_l()     end = get_next_l()
rows[0][-1] = end     for i in range(0, n - 1, 2):        rows[1][i] = rows[1][i + 1] = get_next_l(
    [rows[1][i - 1]] + rows[1][i:i + 2] + [end])
rows[1][-1] = end     front = get_next_l(rows[1][0])
rows[2][0] = front
for i in range(1, n, 2):        rows[2][i] = rows[2][i + 1] = get_next_l([rows[2][i - 1]] + rows[1][i:i + 2]) 
rows[3][0] = front
for i in range(1, n, 2):        rows[3][i] = rows[3][i + 1] = get_next_l([rows[3][i - 1]] + rows[2][i:i + 2]) print(
    "\n".join("".join(r) for r in rows))
