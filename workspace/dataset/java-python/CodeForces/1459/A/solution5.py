import sys 

def main():    inp = sys.stdin.read().strip().split()


out = []
for i in range(2, len(inp), 3):        s = sum((-1) ** (x < y) for x, y in zip(inp[i], inp[i + 1]) if x != y)
out.append(s and ('BLUE', 'RED')[s > 0] or 'EQUAL')
return out
print(*main(), sep='\n')
