from collections import defaultdictimport heapqn, m = map(int, input("").split())rail_list = defaultdict(list) for i in range(m):    start, end = map(int, input("").split())    rail_list[start].append(end)    rail_list[end].append(start) def dijkstra_on_road():    dist_road = {i: float('inf') for i in range(1, n + 1)}    towns = set(range(1, n + 1))    H_road = [(0, 1)]    while len(H_road) != 0:        curr_road_dist, curr_road_id = heapq.heappop(H_road)        if curr_road_dist <= dist_road[curr_road_id]:            road_neighbours = towns - set(rail_list[curr_road_id] + [curr_road_id])            for road_neigbour_id in road_neighbours:                new_road_distance = curr_road_dist + 1                if new_road_distance < dist_road[road_neigbour_id]:                    dist_road[road_neigbour_id] = new_road_distance                    heapq.heappush(H_road, (new_road_distance, road_neigbour_id))     return dist_road[n] def dijkstra_on_rail():    dist_rail = {i: float('inf') for i in range(1, n + 1)}    H_rail = [(0, 1)]    while len(H_rail) != 0:        curr_rail_dist, curr_rail_id = heapq.heappop(H_rail)        if curr_rail_dist <= dist_rail[curr_rail_id]:            for rail_neighbour_id in rail_list[curr_rail_id]:                new_rail_distance = curr_rail_dist + 1                if new_rail_distance < dist_rail[rail_neighbour_id]:                    dist_rail[rail_neighbour_id] = new_rail_distance                    heapq.heappush(H_rail, (new_rail_distance, rail_neighbour_id))     return dist_rail[n] if n in rail_list[1]:    road_time = dijkstra_on_road()    if road_time != float('inf'):        print(road_time)    else:        print('-1')else:    rail_time = dijkstra_on_rail()    if rail_time != float('inf'):        print(rail_time)    else:        print('-1')    