class Racer:    def


__init__(self, name, points): self.name = name
self.points = points


def __str__(self):        return '%s %d' % (self.name, self.points)

 n = int(input())
best = n * [None]
worst = n * [None]
for i in range(n):    name, points = input().split()
points = int(points)
best[i] = Racer(name, points)
worst[i] = Racer(name, points)
m = int(input())
place_bonus = list(reversed(sorted(map(int, input().split()))))
your_name = input().strip() debugging = Falsedef
debug_print(s):
if debugging:        print(s) 

def find(racers, name):    for


i in range(n):
if racers[i].name == name:            return i 

def sort_racers(racers):    racers.sort(key=lambda racer: (-racer.points, racer.name))

    # --- Highest possible ranking. # You get the biggest bonus.you = best[find(best, your_name)]if m != 0:    you.points += place_bonus[0]sort_racers(best) # People ahead of you get the next biggest bonuses.bonus_pos = 1for i in range(find(best, your_name) - 1, -1, -1):    if bonus_pos >= m:        break    best[i].points += place_bonus[bonus_pos]    bonus_pos += 1 # People at the end get the remaining bonuses.for i in range(n - 1, -1, -1):    if bonus_pos >= m:        break    best[i].points += place_bonus[bonus_pos]    bonus_pos += 1sort_racers(best)debug_print(list(map(str, best)))best_ranking = find(best, your_name) + 1debug_print('best ranking: %d' % best_ranking)  #--- Lowest possible ranking. # If you must get a bonus, it's the smallest one.you = worst[find(worst, your_name)]if m == n:    you.points += place_bonus.pop()    m -= 1sort_racers(worst) # Award the smallest possible bonus to the person who can pass you most easily.bonus_pos = m - 1worst_pos = find(worst, your_name) + 1while bonus_pos >= 0 and worst_pos < n:    debug_print('bonus_pos = %d, worst_pos = %d' % (bonus_pos, worst_pos))    candidate = worst[worst_pos]    need = you.points - candidate.points    if candidate.name > you.name:        need += 1    if place_bonus[bonus_pos] >= need:        candidate.points += place_bonus[bonus_pos]        worst_pos += 1    bonus_pos -= 1sort_racers(worst)debug_print(list(map(str, worst)))worst_ranking = find(worst, your_name) + 1debug_print('worst ranking: %d' % worst_ranking) print('%d %d' % (best_ranking, worst_ranking))
