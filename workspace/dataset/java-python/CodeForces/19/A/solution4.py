class Info:    def __init__(self, newTeamName, newPoints, newGoalDiff, newScoredGoals):        self.teamName = newTeamName        self.points = newPoints        self.goalDiff = newGoalDiff        self.scoredGoals = newScoredGoals     def __str__(self):        pattern = '\n*************************\n'        pattern += f'teamName: {self.teamName} \n'        pattern += f'points: {self.points} \n'        pattern += f'goalDiff: {self.goalDiff} \n'        pattern += f'scoredGoals: {self.scoredGoals} \n'        pattern += '*************************\n'        return pattern     def __eq__(self, other):        if isinstance(other, Info):            return self.teamName == other.teamName and \                   self.points == other.points and \                   self.goalDiff == other.goalDiff and \                   self.scoredGoals == other.scoredGoals        return False  # end of class here def findIndexByName(cont: list, searchName: str) -> int:    for i in range(len(cont)):        if cont[i].teamName == searchName:            return i;    return -1  def output(cont):    for item in cont:        print(item)  n, cont = int(input()), list() for i in range(n):    # tName = input()    # obj = Info(tName, 0, 0, 0)    # cont.append(obj)    cont.append(Info(input(), 0, 0, 0)) for i in range(n * (n - 1) // 2):    line = input()    slashInd = line.index('-')    spaceInd = line.index(' ')    colonInd = line.index(':')     team1Name = line[0:slashInd]    team2Name = line[slashInd + 1: spaceInd]    goal1 = int(line[spaceInd + 1: colonInd])    goal2 = int(line[colonInd + 1:])     team1Index = findIndexByName(cont, team1Name)    team2Index = findIndexByName(cont, team2Name)     # update points    if goal1 > goal2:        cont[team1Index].points += 3    elif goal1 < goal2:        cont[team2Index].points += 3    else:        cont[team1Index].points += 1        cont[team2Index].points += 1     # update goaldiff    cont[team1Index].goalDiff += goal1 - goal2    cont[team2Index].goalDiff += goal2 - goal1     # update scoredGoals    cont[team1Index].scoredGoals += goal1    cont[team2Index].scoredGoals += goal2# end of for loop here# sort by points, then by goalDiff, and then by scoredGoals in descending order # print('before')# output(cont)cont.sort(key=lambda item: (item.points, item.goalDiff, item.scoredGoals), reverse=True)# print('\nafter')# output(cont)del cont[n // 2:]# output(cont)cont.sort(key=lambda item: item.teamName)#output(cont)for item in cont:    print(item.teamName) '''        0123456789......line = 'barcelona-real 15:10'-------------------------4ABCDA-B 1:1A-C 2:2A-D 1:0B-C 1:0B-D 0:3C-D 0:3              0               1   cont = |teamName: 'A' |       |points: '''
