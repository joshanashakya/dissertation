from collections import defaultdictfrom

collections
import dequeimport

bisectimport
heapqimport
stringfrom
math
import inf 

def ri():    return int(input())


def rl():    return list(map(int, input().split()))


n, m, x = rl()
keyboard = []  # take inputfor i in range(n):	line = input()	keyboard.append([x for x in line]) #find Sshifts = set()for i in range(n):	for j in range(m):		if keyboard[i][j] == "S":			shifts.add((i,j)) #compute square distancesdist = defaultdict(lambda : inf)a = ord("a")z = ord("z")A = ord("A")Z = ord("Z")reachable = set()for i in range(n):	for j in range(m): 		lower = keyboard[i][j]		#careful of the case we want to type the letter "S"		if lower == "S":			continue		upper = lower.upper()		#add the set of all reachable letters:		reachable.add(lower)		if shifts:			reachable.add(upper)		for shift in shifts:			i1, j1 = shift 			dist[upper] = min(dist[upper], (i-i1)**2 + (j-j1)**2) #set of letters reachable with one handone_hand = set()for i in range(n):	for j in range(m): 		lower = keyboard[i][j]		if lower == "S":			continue		upper = lower.upper()		one_hand.add(lower)		if dist[upper] <= x*x:			one_hand.add(upper) q  =ri()text = input()ans = 0for letter in text:	if letter not in reachable:		ans = -1		break	else:		if letter not in one_hand:			ans += 1print(ans)   
