eggs = int(input())
paint = ['R', 'O', 'Y', 'G', 'B', 'I', 'V']
for _ in range(eggs - 7):  paint.append(
    '0')  # print(paint)for i in range(7,eggs):  paint[i] = paint[i-4]print(''.join(x for x in paint))
