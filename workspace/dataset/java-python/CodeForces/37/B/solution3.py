spell_used = 0parameters = input().split()num_spell = int(parameters[0])max_pow = int(parameters[1])reg_rate = int(parameters[2])input_spell = [0 for i in range(num_spell)]spell = [0 for i in range(num_spell)]power = [0 for i in range(num_spell)]dmg = [0 for i in range(num_spell)]for i in range(num_spell):    input_spell[i]=input()    spell[i]= input_spell[i].split()for i in range(num_spell):    power[i]= int(spell[i][0])    dmg[i] = int(spell[i][1])seconds = 0new_spell = 0curr_spell_dmg = 0new_max_pow = max_poweligible_pow = []eligible_dmg = []ind=[]spell_num=[]list_of_spell_used=[]spell_used_time = []while (new_max_pow>0):    for i in range(len(power)):        if power[i]*max_pow >= new_max_pow*100:            eligible_pow.append(power[i])            eligible_dmg.append(dmg[i])            ind.append(i)    power = [i for j, i in enumerate(power) if j not in ind]    dmg = [i for j, i in enumerate(dmg) if j not in ind]    ind = []    if len(eligible_pow) != 0:             new_spell = eligible_dmg.index(max(eligible_dmg))        spell_used = spell_used + 1        list_of_spell_used.append(str(eligible_pow[new_spell])+" "+str(eligible_dmg[new_spell]))        spell_used_time.append(seconds)        curr_spell_dmg = curr_spell_dmg + eligible_dmg[new_spell]        eligible_pow.pop(new_spell)        eligible_dmg.pop(new_spell)    if (curr_spell_dmg <= reg_rate) and (len(eligible_pow) == 0):        print("NO")        break    else:        new_max_pow = new_max_pow - curr_spell_dmg + reg_rate        if new_max_pow > max_pow:            new_max_pow = max_pow    seconds = seconds + 1if (new_max_pow<=0):    print("YES")    print(seconds,spell_used)    for i in range(len(list_of_spell_used)):        spell_num.append(input_spell.index(list_of_spell_used[i]))        input_spell[spell_num[i]]="None"    for i in range(len(spell_num)):        print( spell_used_time[i],spell_num[i]+1)    
